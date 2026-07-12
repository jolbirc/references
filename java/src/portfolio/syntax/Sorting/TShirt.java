package syntax.Sorting;

public class TShirt implements Comparable<TShirt>
{
    final private String color;
    final private Size size;
    private int price;

    // want to be able to automatically sort by size

    public TShirt(String color, Size size, int price)
    {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getColor()
    {
        return color;
    }

    public Size getSize()
    {
        return size;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    @Override
    public int compareTo(TShirt other)
    {
//        // before (negative), equal (zero), after (positive)
//        // verbose for explanation
//        if (size == Size.SMALL && other.size != Size.SMALL)
//        {
//            return -1;
//        }
//        if (size == Size.LARGE && other.size != Size.LARGE)
//        {
//            return 1;
//        }
//        if (size == other.size)
//        {
//            return 0;
//        }
//        if (size == Size.MEDIUM && other.size == Size.LARGE)
//        {
//            return -1;
//        }
//        return 1;


        return size.compareTo(other.size);
//        return color.compareTo(other.color);
//        return price - other.price;
    }


}
