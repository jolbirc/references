package syntax;

public class StringClass {
   public static void main(String[] args){
        String title = "Java Programming";
        
        int titleLength = title.length();
        char aLetter = title.charAt(0);
        boolean likelyVerb = title.endsWith("ing");   // can also use "startsWith" & "contains"
        String upperTitle = title.toUpperCase();    // can also use toLowerCase
        int startPositionOfProgram = title.indexOf("Program");
        boolean stringIsEmpty = title.isEmpty();
        String modifiedString = title.replace('a', 'A');
        

        System.out.println(titleLength);
        System.out.println(aLetter);

        if (likelyVerb){
            System.out.println("The variable probably holds a verb.");
        }
        else{
            System.out.println("The variable might not be a verb.");
        }

        System.out.println(upperTitle);
        System.out.println(startPositionOfProgram);
        System.out.println(stringIsEmpty);
        System.out.println(modifiedString);
   }     
}
