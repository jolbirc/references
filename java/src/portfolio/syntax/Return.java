package syntax;

import java.util.Scanner;

public class Return 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a phrase");
        String phrase = scanner.nextLine();

        String trimmedPhrase = trimWithElipsis(phrase, 5);
        System.out.println(trimmedPhrase);
    }
    
    static String trimWithElipsis(String text, int length)
    {
        if(text.length() > length)
        {
            String shortPhrase = text.substring(0, length).trim() + "...";
            return shortPhrase;
        }
        else
        {
            return text;
        }   
    }     
}
