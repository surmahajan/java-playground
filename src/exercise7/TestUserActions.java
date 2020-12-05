package exercise7;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;

public class TestUserActions {

    public static void main(String str[]) {
    	PlayList playlistObj = new PlayList();
        
    	List<Song> songs = new ArrayList<Song>();
        
    	Song s1 = new Song(1, "Test1");
    	Song s2 = new Song(2, "test2");
    	
    	songs.add(s1);
    	songs.add(s2);
        
        IUserActions ua = new UserActionsImpl();
        
        ua.addSongsToPlayList(songs, playlistObj);
        
        System.out.println(playlistObj);

    }
}

class Song {
    private int id;
    private String name;

    public Song(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[id: "+id+ "name" + name +"]";
	}
}

class User {

    private int userId;
    private String userName;
    private int planId;
    private PlayList playList;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    // TODO: Generate Getters and Setters

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // override equals
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof User)) {
            return false;
        }

        User user = (User)obj;
        if(this.userId != user.userId)
        {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId);
    }

}

class PlayList {

    private int id;
    
    private String name;
    
    // Sequential or ordered
    private List<Song> songsInPlayList = new ArrayList<Song>();
    
    // Play selected song or random
    private Hashtable<Integer, String> songsInPlayListHT = new Hashtable<Integer, String>();

	@Override
	public String toString() {
		return "PlayList [id=" + id+ ", songsInPlayList=" + songsInPlayList +"]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Song> getSongsInPlayList() {
		return songsInPlayList;
	}

	public void setSongsInPlayList(List<Song> songsInPlayList) {
		this.songsInPlayList = songsInPlayList;
	}

    // GETTERS SETTERS
    // hashcode/equals()
    
    
    
}

interface IUserActions {
    
    void addSongsToPlayList(Song song, PlayList playList);
    
    void addSongsToPlayList(List<Song> songs, PlayList playList);

    void playSong(int songId);

    void deleteSongFromPlayList(int songId, PlayList playList);

    void pauseSong(int songId);
}

class UserActionsImpl implements IUserActions {


    public void addSongsToPlayList(Song song, PlayList playlist) {
    	playlist.getSongsInPlayList().add(song);
    }
    
    public void addSongsToPlayList(List<Song> songs, PlayList playList) {
    	playList.getSongsInPlayList().addAll(songs);
    }

    public void playSong(int songId) {

    }

    public void deleteSongFromPlayList(int songId, PlayList playList) {

    }

    public void pauseSong(int songId) {

    }

}