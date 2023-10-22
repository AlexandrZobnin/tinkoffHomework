package edu.project1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public final class Main {
    private final static Logger LOGGER = LogManager.getLogger();

    private Main() {
    }

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(4);
        String[] dictionary = {"slovo", "hello", "school", "peace", "Russia"};
        String guessWord = dictionary[number];
        String[] letters = new String[guessWord.length()];
        int errors = 0;
        boolean win = false;


        for(int i = 0; i < guessWord.length(); i++) {
            letters[i] = guessWord.substring(i, i + 1);
            //System.out.println(letters[i]);
        }

        System.out.println("The word: ");
        String[] hiddenWord = new String[guessWord.length()];
        for (int i = 0; i < guessWord.length(); i++) {
            hiddenWord[i] = "*";
            System.out.print(hiddenWord[i]);
        }

        System.out.println("");


        while (win != true && errors != 6){
            String inferredLetter = EnteredLetters();
            String[] newWord = CheckingTheCorrectnessOfTheLetter(hiddenWord, letters, guessWord, inferredLetter);
            errors = ErrorChecking(letters, guessWord, inferredLetter, errors);
            WordOutput(guessWord, newWord);
            win = VictoryCheck(newWord, letters);

        }
    }


    public static boolean CheckingTheDefeat(String[] newWord, String[] letters) {
        int winProcess = 0;
        boolean win = false;
        for (int i = 0; i < letters.length; i++) {
            if (newWord[i].equals(letters[i])) {
                winProcess++;
            }
        }
        if (winProcess == letters.length) {
            System.out.println("\nYou won!");
            win = true;
        }
        return win;
    }

    public static boolean VictoryCheck(String[] newWord, String[] letters) {
        int winProcess = 0;
        boolean win = false;
        for (int i = 0; i < letters.length; i++) {
            if (newWord[i].equals(letters[i])) {
                winProcess++;
            }
        }
        if (winProcess == letters.length) {
            System.out.println("\nYou won!");
            win = true;
        }
        return win;
    }

    public static String EnteredLetters() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nGuess a letter: ");
        String inferredLetter = scan.next();
        return inferredLetter;
    }


    public static String[] CheckingTheCorrectnessOfTheLetter(String[] wordAtTheMoment, String[] letters, String word, String inferredLetter) {
        System.out.println(inferredLetter);
        for (int i = 0; i < word.length(); i++) {
            if (inferredLetter.equals(letters[i])){
                wordAtTheMoment[i] = inferredLetter;
                System.out.println("Hit!\n");
            }
        }
        return wordAtTheMoment;
    }

    public static int ErrorChecking (String[] letters, String word, String inferredLetter, int errors) {
        int misspelledWords = 0, maximumNumberOfErrors = 5;
        for (int i = 0; i < word.length(); i++) {
            if (!inferredLetter.equals(letters[i])){
                misspelledWords++;
            }
            if (misspelledWords == letters.length) {
                errors++;
                System.out.println("Missed, mistake " + errors + " out of " + maximumNumberOfErrors + "\n");
                if(errors == 5) {
                    System.out.println("You lost!\n");
                    return 6;
                }
            }
        }
        return errors;
    }

    public static void WordOutput(String word, String[] wordAtTheMoment) {
        System.out.print("The word: ");
        for (int i = 0; i < word.length(); i++)
            System.out.print(wordAtTheMoment[i]);
        System.out.println("");
    }
}
