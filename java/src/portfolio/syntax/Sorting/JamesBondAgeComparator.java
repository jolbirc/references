package syntax.Sorting;

import exercises.JamesBond;

import java.util.Comparator;

public class JamesBondAgeComparator implements Comparator<JamesBond>
{
    @Override
    public int compare(JamesBond bond1, JamesBond bond2)
    {
        return bond1.getYearOfBirth() - bond2.getYearOfBirth();
    }
}
