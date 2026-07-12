package syntax;

import java.util.Random;

public class RandomClass
{
    public static void main(String[] args)
    {
        Random randomGenerator = new Random();
        Random randomGeneratorWithSeed = new Random(97654156);

        //
        for (int i = 0; i < 10; i++)
        {
            int randomInt = randomGenerator.nextInt(5) + 5;    // bound = up to but not including
            System.out.println(randomInt);
        }

        System.out.println();

        //
        for (int i = 0; i < 10; i++)
        {
            double randomDouble = randomGenerator.nextDouble();
            System.out.println(randomDouble);
        }

        System.out.println();

        //
        for (int i = 0; i < 10; i++)
        {
            double randomDouble = (Math.random() * 5) + 5;     // from 5 to 10
            System.out.println(randomDouble);
        }

        System.out.println();

        //
        if (randomGenerator.nextBoolean())
        {
            System.out.println("heads");
        }
        else
        {
            System.out.println("tails");
        }

        System.out.println();

        //
        for (int i = 0; i < 10; i++)
        {
            System.out.println(randomGeneratorWithSeed.nextInt(10));
        }

    }
}
