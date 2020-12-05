package exercise6;

import java.util.*;

public class PlayList {

    private int id;
    
    private String name;
    
    // Sequential or ordered
    private List<Song> songsInPlayList = new ArrayList<Song>();
    
    // Play selected song or random
    private Hashtable<Integer, Song> songsInPlayListHT = new Hashtable<Integer, Song>();

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

	public Hashtable<Integer, Song> getSongsInPlayListHT() {
		return songsInPlayListHT;
	}

	public void setSongsInPlayListHT(Hashtable<Integer, Song> songsInPlayListHT) {
		this.songsInPlayListHT = songsInPlayListHT;
	}

    // GETTERS SETTERS
    // equals()
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PlayList)) {
			return false;
		}

		PlayList pl = (PlayList)obj;
		return false;
		
	}

	// Hashcode
	@Override
	public int hashCode() {
		return Objects.hash(this.id);
	}

	@Override
	public String toString() {
		return "PlayList [id=" + id+ ", songsInPlayList=" + songsInPlayList +"]";
	}
}