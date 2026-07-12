package syntax;

import java.util.Scanner;

public class LoopsWhile
{
    public static void main(String[] args) 
    {
        int count = 0;
        String test = "";
        
        while(count < 10)
        {
            System.out.println("HELLO");
            count++;

            System.out.println("Do you wish to continue? (Type 1 to continue)");
            Scanner scanner = new Scanner(System.in);
            int response = scanner.nextInt();

            if(response != 1)
            {
                break;
            }
        }
    }
}
