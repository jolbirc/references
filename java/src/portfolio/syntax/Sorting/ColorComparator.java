package syntax.Sorting;

import java.util.Comparator;

public class ColorComparator implements Comparator<TShirt>
{

    @Override
    public int compare(TShirt t1, TShirt t2)
    {
        return t1.getColor().compareTo(t2.getColor());
    }
}
