package syntax;

import java.util.Scanner;

public class LoopsFor
{
    public static void main(String[] args) 
    {
        for(int i = 1 /*initialisation statement*/; i <= 10 /*continue condition*/; i++/*increment statement*/)
        {
            System.out.println(i);
        }
        System.out.println();
        
        for(int i = 1, j = 10; i <= 10 && j >= 0; i++, j--)    // conditions need to be same type
        {
            System.out.println("i" + i);
            System.out.println("j" + j);
        }
        System.out.println();

        for(int i = 1, j = 1; i <= 144;)    // fibonacci sequence example
        {
            System.out.println(i);
            int total = i + j;
            i = j;
            j = total;
        }
        System.out.println();

        for(;;)    // runs forever
        {
            System.out.println("hello");
            break;
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        for(;;)
        {
            System.out.println("hello");
            System.out.println("do you want to continue? (true or false)");
            boolean userContinue = scanner.nextBoolean();
            if(!userContinue)
            {
                break;
            }
        }
        System.out.println();

        
        // Nested for loop
        for(int i = 1; i <= 12; i++)
        {
            for (int j = 1; j <= 12; j++) 
            {
                System.out.print(i * j);
                System.out.print(", ");    
            }
            System.out.println();
        }
    }    
}
