package exercises;

import java.util.Scanner;

public class Continue 
{
    public static void main(String[] args) 
    {
        int response = 1;

        while(response == 1)
        {
            System.out.println("Type 1 to continue: ");
            Scanner scanner = new Scanner(System.in);
            response = scanner.nextInt();
            continue;
        }

        System.out.println("Finished.");
    }    
}
