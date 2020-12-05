package exercise6;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TestUserActions {

    public static void main(String str[]) {
    	PlayList playlistObj = new PlayList();
        
    	List<Song> songs = new ArrayList<Song>();        
    	
    	Song s1 = new Song(1, "Test1");
    	Song s2 = new Song(2, "test2");
    	
    	songs.add(s1);
    	songs.add(s2);
    	
        IUserActions ua = new UserActionsImpl();
        
        //ua.addSongsToPlayList(s1, playlistObj);
        ua.addSongsToPlayList(songs, playlistObj);
        System.out.println(playlistObj.getSongsInPlayListHT());
      	
    }
}
