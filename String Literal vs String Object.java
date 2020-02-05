import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //String literal notation
        String stringThree = "slm";
        String stringFour = "slm";
        Boolean result1 = stringThree == stringFour;
        System.out.println(result1);//true

        //String object notation

        String stringOne = new String("slm");
        String stringTwo = new String("slm");
        Boolean result2 = stringOne == stringTwo;
        System.out.println(result2);//false


        // String literal notation vs String object notation
        Boolean result3 = stringOne == stringThree;
        System.out.println(result3); //false
    }


}
