package syntax;

import java.util.Scanner;

public class LoopsDoWhile
{
    public static void main(String[] args) 
    {
        System.out.println("Type the starting number");
        Scanner inputScanner = new Scanner(System.in);
        int startNumber = inputScanner.nextInt();
        inputScanner.nextLine();
        System.out.println();

        do
        {
            if(startNumber < 0)
            {
                System.out.println("Can't count down from a negative!");
            }
            else
            {
                System.out.println(startNumber);
                startNumber--;
            }
        } while(startNumber >= 0);
    }    
}
