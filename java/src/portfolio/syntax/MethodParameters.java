package syntax;

import java.util.Scanner;

public class MethodParameters 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number");
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        printSquaredAndCubed(userNumber);
    }    

    public static void printSquaredAndCubed(int number)
    {
    int squared = number * number;
    int cubed = squared * number;
    System.out.println(number + " squared is " + squared);
    System.out.println(number + " cubed is " + cubed);
    }
}

