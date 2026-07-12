package syntax.Sorting;

import java.util.Comparator;

public class PriceComparator implements Comparator<TShirt>
{

    @Override
    public int compare(TShirt t1, TShirt t2)
    {
        return t1.getPrice() - t2.getPrice();
    }
}
