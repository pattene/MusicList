public class Song implements Comparable <Song> {
 
  public String artist;
  public String name;
  public int year;
  public double score;
  public String notes;
   
  // More fields here
 
  // Default constructor.. you'll need to modify this
  public Song(String artist, String name, int year, double score, String notes) {
    this.artist = artist;
    this.name = name;
    this.year = year;
    this.score = score;
    this.notes = notes;
  }
 
  public int compareTo(Song other)
  {
    return other.name.compareTo(this.name);
  }
 
 
}