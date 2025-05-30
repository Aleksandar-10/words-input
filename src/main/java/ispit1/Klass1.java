package ispit1;

import java.util.ArrayList;
import java.util.Scanner;

public class Klass1 {

    // crate scanner to read from Command panel
    static Scanner scanner = new Scanner(System.in);
    static String STOP_WORD = "STOP";

    // create attributes
    private static int charCount;
    private static int lineCount;
    private static int wordCount;
    private static ArrayList<String> words;
    private static String longestWord;

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

        //Storing in local variables
        storeVariables(klass2);

        //Print results.
        print();
    }


    private static void storeVariables(Klass2 klass2) { //??
        charCount = klass2.getCharCounter();
        lineCount = klass2.getLineCounter();
        words = klass2.getWords();
        wordCount = klass2.getWords().size();
        longestWord = klass2.getLongestWord();
    }


    private static void print() {
        System.out.println("Number of characters: " + getCharCount());
        System.out.println("Number of lines: " + getLineCount());
        System.out.println("Number of words: " + getWordCount());
        System.out.println("Words: " + getWords());
        System.out.println("Longest word: " + getLongestWord());
    }

    public static int getCharCount() { //??
        return charCount;
    }

    public static ArrayList<String> getWords() {
        return words;
    }

    public static String getLongestWord() {
        return longestWord;
    }

    public static int getLineCount() {
        return lineCount;
    }


    public static int getWordCount() {
        return wordCount;
    }



}
