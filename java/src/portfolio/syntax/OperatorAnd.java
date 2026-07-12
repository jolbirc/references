package syntax;

import java.util.Scanner;

public class OperatorAnd
{
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Is the car insured for you to drive? (Type true or false)");
        boolean isInsured = inputScanner.nextBoolean();
        inputScanner.nextLine();

        System.out.println("Do you have a valid driving license? (Type true or false)");
        boolean hasLicense = inputScanner.nextBoolean();
        inputScanner.nextLine();

        System.out.println("Has the car been taxed? (Type true or false)");
        boolean hasTax = inputScanner.nextBoolean();
        inputScanner.nextLine();

        if(isInsured && hasLicense && hasTax)
        {
            System.out.println("You can drive!");
        }
        else
        {
            System.out.println("You can't drive!");
        }
    }
}
