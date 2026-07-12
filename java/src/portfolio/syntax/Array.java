package syntax;

public class Array
{
    public static void main(String[] args) 
    {

        /* - Types can't be mixed
           - Don't declare array on variable (in C style)
        */

        int[] marks = new int[]{23, 65, 77, 12};
        int secondMark = marks[1];    // retrieve value from index
        marks[0] = 24;    // assigning a new value to an array index
        marks[1] = 66;

        String[] names = new String[]{"Josh", "Java", "Python", "Ruby", "Haskell"};    // Array literal
        names[3] = "Golang";
        String lastName = names[4];

        System.out.println(secondMark);
        System.out.println(lastName);
        System.out.println(names[3]);
        
    }
}
