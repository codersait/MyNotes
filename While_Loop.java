import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*ask the user to continuously enter something until
         *they type quit. The moment they type quit
         *they're going to terminate the program.*/

        Scanner scanner = new Scanner(System.in);
        String input = "";

        /*we cannot use comparison operators between
        reference types, because these operators will
        compare the address of string objects, not their value.*/

        while (true) {
            System.out.print("provide input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);


        }
    }
}
