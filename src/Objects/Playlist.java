package Objects;

public class Playlist {

	public static void main(String[] args) {
//		PlaylistDerived playlist = new PlaylistDerived();
//						
//		playlist.addSong("White Christmas", "Bing Crosby", 0);
//		playlist.addSong("White Christmas", "Bedha Skolar", 0);
//		playlist.addSong("Jingle Java Christmas", "NaDHA Skolar", 0);
//		playlist.addSong("All I Want For Christmas is For Nadha To Pass", "The Skolar Family", 0);
//		playlist.addSong("Be My Java Bae", "NAdha Skolar", 1);
//		playlist.addSong("Sad Sitch", "Stellar Skolar", 0);
//		
//		playlist.addSong("Be My Java Bae", "nadha SKOLAR", 0);
//		playlist.addSong("Be My Java Bae", "nadha SKOLAR", 0);
//		
//		System.out.println(playlist);
//
//		
//		playlist.removeSong("Jingle Java Christmas", "NaDHA Skolar", 0);
//		playlist.removeSong("White Christmas", "Bing Crosby", 0);
//
//		System.out.println("----------------");
//		System.out.println(playlist);
//		
//		System.out.println("----------------");
//		System.out.println(playlist.customPlayList("Nadha Skolar"));
//		
//		System.out.println("----------------");
//		System.out.println(playlist.customPlayList("Skolar"));
//		
//		System.out.println("----------------");
//		System.out.println(playlist.customPlayList(0));
//		
//        for (int i=1; i<=10; i++) {
//            String songTitle = "AddMe" + i;
//            playlist.addSong(songTitle, "Nadha Skolar", 1);
//        }
		//test creating the empty playlist
        //*********************************************************
        System.out.println("***** Testing creating new playlist *****");
        PlaylistDerived myPlaylist = new PlaylistDerived();
        System.out.println(myPlaylist.toString());

        //test adding variou songs
        //*********************************************************
        System.out.println("***** Testing adding 6 songs ***** ");
        myPlaylist.addSong("White Christmas", "Bing Crosby", 0);
        myPlaylist.addSong("White Christmas", "Bedha Skolar", 0);
        myPlaylist.addSong("Jingle Java Christmas", "NaDHA Skolar", 0);
        myPlaylist.addSong("All I Want For Christmas is For Nadha To Pass", "The Skolar Family", 0);
        myPlaylist.addSong("Be My Java Bae", "NAdha Skolar", 1);
        myPlaylist.addSong("Sad Sitch", "Stellar Skolar", 0);
        System.out.println(myPlaylist.toString());

        //test adding duplicate songs
        //*********************************************************
        System.out.println("***** Testing adding duplicate songs ***** ");

        //not a duplicate but close -- should be able to add this
        if (myPlaylist.addSong("Be My Java Bae", "nadha SKOLAR", 0) != -1) {
            System.out.println("SUCCESS: Near duplicate song Be My Java Bae (genre 0) successfully added");
        } else {
            System.out.println("TEST FAIL: Close to duplicate song Be My Java Bae (genre 0) was not added");
        }

        //now it's a duplicate song --should not add
        if (myPlaylist.addSong("Be My Java Bae", "Nadha Skolar", 1) == -1) {
            System.out.println("SUCCESS: Duplicate song Be My Java Bae (genre 0) not added");
        }
        else {
            System.out.println("TEST FAIL: Duplicate song Be My Java Bae (genre 0) was added");
        }

        //duplicate song
        if (myPlaylist.addSong("Jingle Java Christmas", "Nadha SkolAR", 0) == -1) {
            System.out.println("SUCCESS: Duplicate song Jingle Java Christmas (genre 0) not added");
        }
        else {
            System.out.println("TEST FAIL: Duplicate song Jingle Java Christmas (genre 0) was added");
        }

        //visually verify playlist
        System.out.println("");
        System.out.println(myPlaylist.toString());

        //test removing songs
        //*********************************************************
        System.out.println("***** Testing removing existing and non-existing song ***** ");

        //existing song - should remove
        if (myPlaylist.removeSong("Jingle Java Christmas", "Nadha Skolar", 0) == -1) {
            System.out.println("TEST FAIL: Existing song Jingle Java Christmas (genre 0) could not be removed.");
        }else {
            System.out.println("SUCCESS: Existing song Jingle Java Christmas (genre 0) successfully removed");
        }

        //existing song - should remove
        if (myPlaylist.removeSong("White Christmas", "Bing Crosby", 0) == -1) {
            System.out.println("TEST FAIL: Existing song White Christmas (genre 0) was not removed");
        }
        else {
            System.out.println("SUCCESS: Existing song White Christmas (genre 0) successfully removed");
        }

        //not existing song - should not be able to remove
        if (myPlaylist.removeSong("Black and White Christmas", "Bing Crosby", 0) != -1) {
            System.out.println("TEST FAIL: Non-existing song Black and White Christmas (genre 0) was removed");
        }
        else {
            System.out.println("SUCCESS: Non-existing Black and White Christmas (genre 0) could not be removed");
        }

        //visually verify playlist
        System.out.println("");
        System.out.println(myPlaylist.toString());

        //test custom playlist - artist
        //*********************************************************
        System.out.println("Testing custom playlist for non-existing artist: Scholar");
        System.out.println(myPlaylist.customPlayList("Scholar"));
        System.out.println();

        System.out.println("***** Testing custom playlist for existing artist: Nadha Skolar ***** ");
        System.out.println(myPlaylist.customPlayList("Nadha Skolar"));

        System.out.println("Testing custom playlist for existing artist: Skolar");
        System.out.println(myPlaylist.customPlayList("Skolar"));

        //test overloaded custom playlist - genre
        //*********************************************************
        System.out.println("***** Testing custom playlist for non-existing genre 9 ***** ");
        System.out.println(myPlaylist.customPlayList(9));
        System.out.println();

        System.out.println("***** Testing custom playlist for genre 0 ***** ");
        System.out.println(myPlaylist.customPlayList(0));


        //test overflowing the playlist with too many songs -- should throw exception
        //*********************************************************
        System.out.println("***** Testing overflowing the playlist ***** ");
        System.out.println(myPlaylist.toString());
        System.out.println("Testing overflowing by adding to test throws exception");
        for (int i=1; i<=10; i++) {
            String songTitle = "AddMe" + i;
            myPlaylist.addSong(songTitle, "Nadha Skolar", 1);
        }
		

	}

}
