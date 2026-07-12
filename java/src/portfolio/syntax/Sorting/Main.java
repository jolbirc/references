package syntax.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
//        List<String> names = new ArrayList<>();
//        names.add("Janet");
//        names.add("Charlie");
//        names.add("Eleanor");
//        names.add("Tom");
//        names.add("Jason");
//        names.add("Michael");
//        names.add("Michelle");
//
//        Collections.sort(names);
//        System.out.println(names);

        ArrayList<TShirt> tShirts = new ArrayList<>();
        tShirts.add(new TShirt("brown", Size.MEDIUM, 999));
        tShirts.add(new TShirt("red", Size.LARGE, 499));
        tShirts.add(new TShirt("green", Size.SMALL, 1299));

        // Collections.sort(tShirts);    // uses default (natural) ordering; size
//        PriceComparator priceComparator = new PriceComparator();
//        Collections.sort(tShirts, priceComparator);
        ColorComparator colorComparator = new ColorComparator();
        Collections.sort(tShirts, colorComparator);

        for (TShirt tShirt : tShirts)
        {
            System.out.println(tShirt.getColor() + " " + tShirt.getSize() + " " + tShirt.getPrice());
        }

    }
}
