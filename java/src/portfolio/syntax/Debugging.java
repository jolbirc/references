package syntax;

import java.util.ArrayList;
import java.util.Arrays;

public class Debugging
{
    public static void main(String[] args)
    {
        int i = 7;
        int j = 9;
        String name = "Java";
        String[] programmingLanguages = {"Java", "Java", "Python", "Java", "C", "C++"};

        ArrayList<String> programmingLanguagesList = new ArrayList<>(Arrays.asList(programmingLanguages));
        removeLanguage("Java", programmingLanguagesList);

        for (Object lang : programmingLanguagesList)
        {
            System.out.println(lang);
        }

        i = i + 5;

        int x = i * j;

        int y = multiply(x, i);

        System.out.println(x);
    }

    static int multiply(int number1, int number2)
    {
        int result = number1 * number2;
        return result;
    }

    static void removeLanguage(String lang, ArrayList<String> langs)
    {
        for (int i = 0; i < langs.size(); i++)
        {
            if(langs.get(i).equals(lang))
            {
                langs.remove(i);
                i--;
            }
        }
    }
}
