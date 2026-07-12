package syntax;

public class ArrayMultidimensional
{
    public static void main(String[] args)
    {
        String[] names = {
                "Andrew",
                "Helen",
                "Janet",
                "Mike"
        };    // 1D array

        String[][] modules = {
                {"CO4201", "Professional Skills", "Graham"},
                {"CO4210", "User Experience", "Andy"},
                {"CO4225", "Programming I", "Andrew"}
        };

        String[][] staffMembers = {
                {"Mike", "THA140", "CO4024"},
                {"Graham", "TAS030", "CO4005"},
                {"Andrew", "TAS033", "CO4025"},
                {"Andy", "TAS034", "CO4010"},
                {"Serban", "THA030", "CO4027"}
        };

        // String[][] staffMembers = new String[5][3];    < this would declare the array and size to specify contents
        // later

        String[] programming = modules[2];
        String title = programming[1];
        String item = modules[0][0];

        for (String info : programming)
        {
            System.out.println(info);
        }
        System.out.println();

        System.out.println(title + "\n");
        System.out.println(item + "\n");

        for (String[] module : modules)
        {
            System.out.println(module[0] + ": " + module[1] + " (" + module[2] + ")\n");
        }

        for (String[] module : modules)
        {
            for (String items : module)
            {
                System.out.println(items);
            }
        }
        System.out.println();

        for (int i = 0; i < modules.length; i++)    // More verbose version of loop above ^
        {
            for (int j = 0; j < modules[i].length; j++)
            {
                System.out.println(modules[i][j]);
            }
        }

    }
}
