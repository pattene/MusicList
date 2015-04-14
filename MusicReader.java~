import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class MusicReader {
 
  private BufferedReader br;
  
  public MusicReader ()
  {
    
  }
  
  public void open (String filename)
  {
    try 
    {
    br = new BufferedReader(new FileReader(filename));
    }
    catch (java.io.IOException e) 
    {
      System.out.println("File not found : " + filename);
    }
  }
  
  public void close ()
  {
    try {
    if (br != null)
      br.close();
    }
    catch (java.io.IOException e)
    {
      System.out.println("File not open");
    }
  }
  
  public String[] getSongData ()
  {
    if (br == null)
      return null;
    
    String line = "";

    try 
    {
         line = br.readLine();
    }
    catch (java.io.IOException e)
    {
      System.out.println("Error reading from file");
    }
    
    if (line == null)
      return null;
    
    String[] data = line.split(",");
    
    return data;
    
  }
 
}