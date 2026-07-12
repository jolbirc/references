package exercises;

public class SwitchCase
{
    public static void main(String[] args)
    {
        String text = "-1011";
        int number = Integer.parseInt(text);
        switch(number)
        {
            case -1011:
                System.out.println("a");
                break;
            case -7:
                System.out.println("b");
                break;
            case 7:
                System.out.println("c");
                break;
            case 1011:
                System.out.println("d");
                break;
        }
    }
}
