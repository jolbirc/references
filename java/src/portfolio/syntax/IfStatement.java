package syntax;

import java.util.Scanner;

public class IfStatement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = true;

        if(isRaining)
        {
            System.out.println("Take an umbrella");
        }

        System.out.println("Please type your age");
        int age = scanner.nextInt();

        if(age >= 68)
        {
            System.out.println("You can (or may have) retire(d).");
        }

        if(age < 18)
        {
            System.out.println("You cannot buy alcoho");
        }
    }
}
