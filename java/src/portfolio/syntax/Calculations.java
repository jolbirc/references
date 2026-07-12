package syntax;

public class Calculations
{
    public static void main(String[] args) 
    {
        final int yearFounded = 1839;    // final = constant
        final String institutionName = "University of Chester";
        
        int z = 1;

        double a = 4.4;
        double b = 6.6;
        double result = b / a;
        double remainder = b % a;

        char x = 'x';

        int one = 2;
        int two = 4;
        int three = 8;
        int four = 9;

        double all = a + b + x;    // x is taking the ASCII value of 'x' which is 120
        int resultTwo = ((one + two) * three) / four;

        System.out.println(result);
        System.out.println(remainder);
        System.out.println(all);

        System.out.println(z);
        z++;
        System.out.println(z);

        System.out.println(resultTwo);
        
        System.exit(0);
    }
}
