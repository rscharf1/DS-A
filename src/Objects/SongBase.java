package Objects;

public class SongBase {
	private String title;
	private String artist; 
	private int genre; 
	
	public SongBase() {
		title = "";
		artist = "";
		genre = -1; 
	}
	
	SongBase(String title, String artist, int genre) {
		this.title = title; 
		this.artist = artist; 
		this.genre = genre; 
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setGenre(int genre) {
		this.genre = genre; 
	}
	
	public String getTitle() {
		return title; 
	}
	
	public String getArtist() {
		return artist; 
	}
	
	public int getGenre() {
		return genre; 
	}
	
	public String getGenreName() {
		if(genre==0) {
			return "Holiday";
		}
		else if(genre==1) {
			return "Dance";
		}
		else if(genre==2) {
			return  "Romance";
		}
		else {
			return ""; 
		}
	}
	
	public String toString() {
		return "Title: " + this.getTitle() + "\nArtist: " + artist + "\nGenre: " + this.getGenreName() + "\n\n";	
	}
	
	public boolean equals(SongBase other) {
		if(this.title.equalsIgnoreCase(other.getTitle()) && this.artist.equalsIgnoreCase(other.getArtist()) && this.genre == other.getGenre()) {
			return true; 
		}
		return false; 
	}
	

}
