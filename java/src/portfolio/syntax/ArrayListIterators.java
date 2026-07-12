package syntax;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterators
{
    public static void main(String[] args)
    {
        ArrayList<String> langList = new ArrayList<>();

        langList.add("Java");
        langList.add("C");
        langList.add("C++");
        langList.add("Python");
        langList.add("Rust");
        langList.add("Assembly");

//        for (String lang : langList)
//        {
//            if(lang.length() == 3)
//            {
//                langList.remove(lang);
//            }
//
//            // ConcurrentModificationException ^

        Iterator<String> langIterator = langList.iterator();    // must declare the type it's iterating over <String>

        while(langIterator.hasNext())
        {
            String name = langIterator.next();
            if (name.length() == 4)
            {
                langIterator.remove();
            }
        }

        for (String lang : langList)
        {
            System.out.println(lang);
        }
    }
}

