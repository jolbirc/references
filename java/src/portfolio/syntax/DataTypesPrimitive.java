package syntax;

public class DataTypesPrimitive
{
    public static void main(String[] args)
    {
        String name = "Josh";   // String in Java is actually a class

        boolean isHungry = false;   // 0 and 1 not valid in Java for bool
        int yearFounded = 1839;    // +/-(2^31 - 1)
        long bigNumber = 100000000000L;    // L suffix; +/-(2^63 - 1)
        double shareOfCake = 0.33333333;
        float lessAccurateShareOfCake = 0.3333F;    // F suffix; less precise
        char firstInitial = 'J';    // Single quotation marks
    }
}
