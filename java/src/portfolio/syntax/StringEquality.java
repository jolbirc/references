package syntax;

public class StringEquality
{
    public static void main(String[] args) 
    {
        String a = "Hello";

        String b = new String();
        b = b + "Hello";

        if(a.equals(b))
        {
            System.out.println("The strings match");
        }
        else
        {
            System.out.println("The strings do not match");
        }
    }
}
