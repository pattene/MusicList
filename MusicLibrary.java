import java.util.*;

public class MusicLibrary {
 
  private ArrayList<Song> songs;
  private int currentSortField = 0;  // Unsorted
 
  public MusicLibrary()
  {
    this.songs= new ArrayList<Song>();
  }
 
  public int count ()
  {
     return songs.size();
  }
 
  public void addSong (Song song)
  {
    songs.add(song);
  }
 
  /*
   * Retrieve a song by number
   * Return null if song index num is out of bounds
   */
 
  public Song getSong (int num)
  {
    return songs.get(num);
  }
 
  /*
   * Sort song list by title
   */
  public void Sort ()
  {
    Collections.sort(songs);
  }
 
  /*
   * Sort song list by a specific field
   *
   * 1 = title
   * 2 = artist
   */
  public void Sort (int field)
  {
    currentSortField = field;
  }
 
  /*
   * Shuffle song list
   */
  public void Shuffle ()
  {
    long seed = System.nanoTime();
    Collections.shuffle(songs, new Random(seed));
  }
}