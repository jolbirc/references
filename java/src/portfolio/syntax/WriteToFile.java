package exercises;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteToFile
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Type a name to append to file or press enter to exit: ");
            String input = scanner.nextLine();

            if(input.isEmpty())
            {
                break;
            }

            names.add(input);
        }

        arrayListToFile(names);

    }

    private static void arrayListToFile(ArrayList<String> arrayList)
    {
        Path location = Paths.get("data/names.txt");
        Charset utf8 = StandardCharsets.UTF_8;

        try
        {
            Files.write(location, arrayList, utf8, StandardOpenOption.APPEND);
        }
        catch (IOException e)
        {
            System.out.println("The file could not be saved");
        }
    }
}
