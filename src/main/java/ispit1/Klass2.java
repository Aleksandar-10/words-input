package ispit1;

import java.util.ArrayList;

public class Klass2 {
    static String STOP_WORD = "STOP";

    private int charCounter = 0;
    private int lineCounter = 0;
    private final ArrayList<String> words = new ArrayList<>();
    private String longestWord = "";


    public Klass2() {
    }

    boolean count(String input) {
        if (!input.equalsIgnoreCase(STOP_WORD)) {

            lineCounter++;
            charCounter += input.length();

            String[] splitWords = input.split(" ");
            for (String word : splitWords) {
                words.add(word);
                updateLongestWord(word);
            }
            return true;
        }
        return false;
    }

    private void updateLongestWord(String word) {
        if (word.length() > longestWord.length()) {
            longestWord = word;
        }
    }

    public int getCharCounter() {
        return charCounter;

    }

    public int getLineCounter() {
        return lineCounter;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public String getLongestWord() {
        return longestWord;
    }
}
