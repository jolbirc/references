package syntax;

import java.util.ArrayList;

public class ArrayListFiltering
{
    public static void main(String[] args)
    {
        ArrayList<String> langList = new ArrayList<>();

        langList.add("Java");
        langList.add("C");
        langList.add("C++");
        langList.add("Python");
        langList.add("Assembly");

        ArrayList<String> shortLanguages = new ArrayList<>();

        // does the name of the language contain 4 characters or fewer?
        for (String lang : langList)
        {
            if(lang.length() <= 4)
            {
                shortLanguages.add(lang);
            }
        }

        for (String lang : shortLanguages)
        {
            System.out.println(lang);
        }

    }
}
