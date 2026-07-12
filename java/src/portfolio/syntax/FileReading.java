package syntax;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReading
{
    public static void main(String[] args)
    {
        ArrayList<String> artists = new ArrayList<>();
        File artistsFile = new File("data/artists.txt");

        try
        {
            Scanner fileScanner = new Scanner(artistsFile);

            while(fileScanner.hasNext())
            {
                String artist = fileScanner.nextLine();
                artists.add(artist);
            }
        }
        catch (FileNotFoundException e)
        {
            // something has failed reading the file, tell the user
            System.out.println("Sorry, we couldn't read the file!");
            System.out.println(e.getMessage());
        }

        for (String artist : artists)
        {
            System.out.println(artist);
        }
    }
}
