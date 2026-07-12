package syntax;

import java.util.Scanner;

/* Methods are normally tied to a class; Functions are independent */
public class Methods 
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        // Greeting user
        greetUser();
        // Squaring users number
        squareUserNumber();

        printMenu(3);
        System.out.println("hello all");

        char someLetter = "hello".charAt(3);
    }

    static void greetUser()
    {
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    static void squareUserNumber()
    {
        System.out.println("Please type your favourite number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int result = number * number;
        System.out.println("Your favourite number squared is " + result);
    }

    static void printMenu(int numberOfTimes)
    {
        for (int i = 0; i < numberOfTimes; i++) 
        {
            System.out.println("****MENU****");    
        }
        
    }

    static int multiply(int a, int b, int c)
    {
        int result = a * b * c;
        return result;
    }

    static int numberToOwnPower(int number)
    {
        int total = number;
        for(int i=1; i < number; i++)
        {
            total *= number;
        }

        return total;
    }
}
