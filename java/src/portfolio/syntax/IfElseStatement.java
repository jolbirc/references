package syntax;

import java.util.Scanner;

public class IfElseStatement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is it raining? (Type true or false)");

        boolean isRaining = scanner.nextBoolean();

        if(isRaining)
        {
            System.out.println("Take an umbrella");
        }
        else
        {
            System.out.println("Take a sun hat");
        }
    }
}
