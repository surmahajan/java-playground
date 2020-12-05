package exercise6;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UserActionsImpl implements IUserActions {


    public void addSongsToPlayList(Song song, PlayList playlist) {
    	//playlist.getSongsInPlayList().add(song);
    	playlist.getSongsInPlayListHT().put(song.getId(), song);
    	
    }
    
    public void addSongsToPlayList(List<Song> songs, PlayList playList) {
    	//playList.getSongsInPlayList().addAll(songs);
    	Map<Integer, Song> collect = songs.stream().collect(Collectors.toMap(Song::getId, Function.identity()));
    	playList.getSongsInPlayListHT().putAll(collect);
    }

    public void playSong(int songId) {

    }

    public void deleteSongFromPlayList(int songId, PlayList playList) {

    }

    public void pauseSong(int songId) {

    }

}