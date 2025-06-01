package ispit1;

import java.util.Scanner;

public class Klass1 {

    // crate scanner to read from the Command panel
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input;
        Klass2 klass2 = new Klass2();
        System.out.println("Input one word per line:");

        // loop for entering words on the command line that executes at least once.
        boolean continueLoop;
        do {
            input = scanner.nextLine();
            continueLoop = klass2.count(input);
        } while (continueLoop);

        //Print results
        print(klass2);
    }


    private static void print(Klass2 klass2) {
        System.out.println("Number of characters: " + klass2.getCharCounter());
        System.out.println("Number of lines: " + klass2.getLineCounter());
        System.out.println("Number of words: " + klass2.getWords().size());
        System.out.println("Words: " +klass2.getWords());
        System.out.println("Longest word: " + klass2.getLongestWord());
    }
}
