package syntax;

import javax.swing.*;
import java.text.DecimalFormat;

public class MethodOverloading
{
    public static void main(String[] args)
    {
        System.out.println();    // println takes method overloading; multiple arguments of different types
        System.out.println(Integer.toString(23));
        System.out.println(Integer.toString(23, 16));    // clear example of method overloading
        System.out.println();

        // both work given both declarations
        greet("Josh");
        greet("Mr", "Bond");
        System.out.println();

        String amount1 = formatAsCurrency(2.00);
        String amount2 = formatAsCurrency(4);
        System.out.println(amount1 + ", " + amount2);
    }

    static void greet(String name)
    {
        System.out.println("Hello " + name);
    }

    static void greet(String title, String name)
    {
        System.out.println("Hello " + title + " " + name);
    }

    // chaining
    static String formatAsCurrency(int amount)
    {
        return formatAsCurrency(new Double(amount));
    }

    static String formatAsCurrency(double amount)
    {
        DecimalFormat format = new DecimalFormat("£0.00");
        return format.format(amount);
    }

}
