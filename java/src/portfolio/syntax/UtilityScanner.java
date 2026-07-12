package syntax;

import java.util.Scanner;

public class UtilityScanner
{
    public static void main(String[] args) 
    {
        System.out.println("Please type your name:");

        Scanner inputScanner = new Scanner(System.in);

        String userName = inputScanner.nextLine();

        String greeting = "Hello " + userName;

        System.out.println(greeting);
    }
}
