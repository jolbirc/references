package syntax;

import java.util.ArrayList;

public class ArrayLists 
{
    public static void main(String[] args) 
    {
        ArrayList<String> langList = new ArrayList<String>();
        ArrayList<Integer> marks = new ArrayList<Integer>();
        
        langList.add("Java");
        langList.add("Python");
        langList.add("C++");
        langList.add("Haskell");

        marks.add(40);
        marks.add(70);
        marks.add(1);
        marks.add(87);

        if(langList.contains("C"))
        {
            System.out.println("C is in the list");
        }
        else
        {
            System.out.println("C is not in the list");
        }

        System.out.println();

        //

        String secondLang = langList.get(1);
        System.out.println(secondLang);
        System.out.println();

        for(String lang : langList) 
        {
            System.out.println(lang);
        }

        System.out.println();

        //

        langList.set(2, "JavaScript");  // replace an element
        langList.add(1, "Ruby");    // add an element at given index
        langList.remove("Java");    // remove specified object/value
        langList.remove(3);    // remove specified index

        marks.remove(1);    // will remove the INDEX not the VALUE
        marks.remove(Integer.valueOf(1));   // will remove value; has to be Integer class not primitive type int

        for (String lang : langList) 
        {
            System.out.println(lang);    
        }

        System.out.println();

        for (Integer mark : marks) 
        {
            System.out.println(mark);
        }

        System.out.println();

        //

        int length = langList.size();
        System.out.println("Language list has " + length + " items");
        System.out.println();

        /* Other ArrayList Methods */

        System.out.println(langList.isEmpty());    // checks if an ArrayList is empty
        System.out.println(langList.size());    // returns sized of list

        /* Converting an ArrayList to a standard array */

        Object[] stringArray = langList.toArray();

    }    
}
