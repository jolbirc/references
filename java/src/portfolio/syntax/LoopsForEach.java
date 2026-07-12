package syntax;

import java.util.Scanner;

public class LoopsForEach
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many names you want to store: ");
        int countOfNames = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[countOfNames];

        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Type a name:");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nThank you for typing the names!\nThe names you entered were:");

//        for (int i = 0; i < names.length; i++)
//        {
//            System.out.println(names[i]);
//        }

        for (String name : names)
        {
            System.out.println(name);
        }


    }




}
