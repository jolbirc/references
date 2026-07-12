package syntax;

import java.util.ArrayList;

public class Enums
{
    static ArrayList<ClothingItem> allClothes = new ArrayList<>();

    public static void main(String[] args)
    {
        ClothingItem tShirt = new ClothingItem("black T-shirt", Enum.MENS, 1599);
        ClothingItem skirt = new ClothingItem("blue skirt", Enum.WOMENS, 2599);
        ClothingItem tights = new ClothingItem("grey tights", Enum.WOMENS, 499);
        ClothingItem dress = new ClothingItem("red dress", Enum.WOMENS, 3499);
        ClothingItem jeans = new ClothingItem("kids jeans", Enum.CHILDRENS, 699);

        allClothes.add(tShirt);
        allClothes.add(skirt);
        allClothes.add(tights);
        allClothes.add(dress);

        ArrayList<ClothingItem> womensClothes = womensClothes();
        for (ClothingItem item : womensClothes)
        {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
    }

    static class ClothingItem
    {
        // ivar
        final private String name;
        final private Enum anEnum;
        private int price;

        // constructor
        public ClothingItem(String name, Enum anEnum, int price)
        {
            this.name = name;
            this.anEnum = anEnum;
            this.price = price;
        }

        // getters
        public String getName()
        {
            return name;
        }

        public Enum getCategory()
        {
            return anEnum;
        }

        public int getPrice()
        {
            return price;
        }
    }

    static ArrayList<ClothingItem> womensClothes()
    {
        ArrayList<ClothingItem> womens = new ArrayList<>();

        for (ClothingItem clothingItem : allClothes)
        {
            if (clothingItem.getCategory() == Enum.WOMENS)
            {
                womens.add(clothingItem);
            }
        }

        return womens;
    }
}





