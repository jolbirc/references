package syntax;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWriting
{
    public static void main(String[] args)
    {
        ArrayList<String> vegetables = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Type a vegetable name or press enter to exit");
            String input = scanner.nextLine();

            if(input.isEmpty())
            {
                break;
            }

            vegetables.add(input);
        }

        //todo: write vegetables to file

        Path location = Paths.get("data/vegetables.txt");
        Charset utf8 = StandardCharsets.UTF_8;

        try
        {
            Files.write(location, vegetables, utf8);
        }
        catch(IOException e)
        {
            System.out.println("The file could not be saved");
            System.out.println(e.getMessage());
        }
    }
}
