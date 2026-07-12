package syntax;

public class AppendingStrings
{
    public static void main(String[] args)
    {
        String wallPhrase = " green bottles hanging on the wall";
        String verse = "10" + wallPhrase + ",\n";

        verse = verse + "10" + wallPhrase + ",\n";
        verse = verse + "and if one green bottle should accidentally fall, there'd be ";
        verse = verse + "9" + wallPhrase;
        System.out.println(verse);

        // Shorthand form
        System.out.println();
        String burger = "1/4 pounder";
        burger += " with cheese";
        System.out.println(burger);
    }
}
