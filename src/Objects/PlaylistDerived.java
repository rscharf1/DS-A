package Objects;

public class PlaylistDerived extends SongBase {
	public static final int MAXSIZE = 8;
	SongBase[] playlist = new SongBase[MAXSIZE]; 
	int count; 
	
	public PlaylistDerived() {
		this.count = 0; 
	}
	
	public int getCount() {
		return count; 
	}
	
	public int addSong(String title, String artist, int genre) throws ArrayIndexOutOfBoundsException {
		SongBase song = new SongBase(title, artist, genre);
		int result = findSong(song);
		if(result==0) { 
			return -1;
		}
		if(count==MAXSIZE-1) {
			throw new ArrayIndexOutOfBoundsException( "Error -- playlist is full. Maximum size is " + MAXSIZE);
		}
		playlist[count] = song; 
		count++; 
		return 0; 
	}
	
	public int removeSong(String title, String artist, int genre) {
		SongBase song = new SongBase(title, artist, genre);
		int result = findSong(song);
		if(result==-1) {
			return -1;
		}
		int index=0;
		for(int i=0; i<count; i++) {
			if(playlist[i].equals(song)) {
				index = i; 
			}
		}
		moveSongsUp(index);
		count--;
		return 0;
	}
	
	public void moveSongsUp(int position) {
		if(position==count) {
			playlist[count] = null; 
		}
		else {
			for(int i=position+1; i<count; i++) {
				playlist[i-1] = playlist[i];
			}
			playlist[count] = null; 
		}
		
	}
	
	public int findSong(SongBase songtoFind) {
		for(int i=0; i<count; i++) {
			if(playlist[i].equals(songtoFind)) {
				return 0; 
			}
		}
		return -1; 
	}
	
	public String customPlayList(String artist) {
		String x=""; 
		int songs=0;
		for(int i=0; i<count; i++) {
			if((playlist[i].getArtist().toLowerCase()).contains(artist.toLowerCase())) {
				songs++;
				x += songs + ". " + playlist[i].toString();
			}
		}
		if(songs==0) {
			return "No songs by this artist found";
		}
		return "Artist Search: " + artist + " (" + songs + " songs )\n\n" + x;

	}

	public String customPlayList(int genre) {
		String x=""; 
		int songs=0;
		String name="";
		for(int i=0; i<count; i++) {
			if(playlist[i].getGenre()==genre) {
				songs++;
				x += songs + ". " + playlist[i].toString();
				name = playlist[i].getGenreName();
			}
		}
		if(songs==0) {
			return "No songs in this genre found";
		}
		return "Genre Search: " + name + " (" + songs + " songs )\n\n" + x;
	}
	
	public String toString() {
		if(count==0) {
			return "Playlist is empty";
		}
		String x = "My Playlist (count of songs = " + count + ")\n\n";
		for(int i=0; i<count; i++) {
			x += (i+1) + ". " + playlist[i].toString();
		}
		return x; 
	}

}
