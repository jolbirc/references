package syntax.Classes;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        /* 1 */
        ClassesOne programmingI = new ClassesOne("CO4225", "Programming I");
        ClassesOne innovationProject = new ClassesOne("CO6008", "Innovation Project", 40);

        String moduleCode = programmingI.getCode();
        int level = programmingI.getLevel();
        int innovationProjectCredits = innovationProject.getCredits();

        System.out.println(moduleCode);
        System.out.println(level);
        System.out.println(innovationProjectCredits);
        System.out.println("\n\n");

        /* 2 */
        ClassesTwo chesterCoord = new ClassesTwo(53.193392, -2.893075);
        ClassesTwo londonCoord = new ClassesTwo(51.507351, -0.127758);
        ArrayList<ClassesTwo> coordinatesVisited = new ArrayList<ClassesTwo>();

        chesterCoord.setLongitude(0.0);
        coordinatesVisited.add(chesterCoord);
        coordinatesVisited.add(londonCoord);

        System.out.println(chesterCoord.getLatitude());
        System.out.println(chesterCoord.getLongitude());
        System.out.println(chesterCoord.getLatitudeDegrees());
        System.out.println(chesterCoord.getLatitudeMinutes());
        System.out.println(chesterCoord.getLatitudeSeconds());
        System.out.println();

        if(chesterCoord.isNorthOf(londonCoord))
        {
            System.out.println("Chester is north of London");
        }
        else
        {
            System.out.println("Chester is not north of London");
        }
        System.out.println();

        for (ClassesTwo coordinate : coordinatesVisited)
        {
            System.out.println(coordinate);
        }
    }

}
