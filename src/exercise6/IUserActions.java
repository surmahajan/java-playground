package exercise6;

import java.util.Hashtable;
import java.util.List;

public interface IUserActions {
    
    void addSongsToPlayList(Song song, PlayList playList);
    
    void addSongsToPlayList(List<Song> songs, PlayList playList);

    void playSong(int songId);

    void deleteSongFromPlayList(int songId, PlayList playList);

    void pauseSong(int songId);

}