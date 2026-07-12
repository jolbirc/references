package syntax;

import java.util.Scanner;

public class OperatorOr
{
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("Are you already married? (Type true or false)");
        boolean alreadyMarried = inputScanner.nextBoolean();
        inputScanner.nextLine();
        
        System.out.println("Are you over 18? (Type true or false?)");
        boolean over18 = inputScanner.nextBoolean();
        inputScanner.nextLine();

        boolean over16 = true;

        if(!over18)
        {
            System.out.println("Are you over 16? (Type true or false)");
            over16 = inputScanner.nextBoolean();
            inputScanner.nextLine();
        }

        System.out.println("Do you have parental consent");
        boolean consent = inputScanner.nextBoolean();
        inputScanner.nextLine();

        System.out.println("Are you in Scotland?");
        boolean inScotland = inputScanner.nextBoolean();
        inputScanner.nextLine();

        if(!alreadyMarried && (over18) || (over16 && consent) || (over16 && inScotland))
        {
            System.out.println("You may get married");
        }
        else
        {
            System.out.println("You are not permitted to get married");
        }
    }      
}
