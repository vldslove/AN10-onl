package lesson10.part1;

import lesson10.part1.DocumentMethods;
import lesson10.part1.EndingSubsequenceException;
import lesson10.part1.LetterSubsequenceException;
import lesson10.part1.NumberSubsequenceException;

public class StringDocument extends DocumentMethods {
    public static void main(String[] args) throws Exception {

        firstTwoBlocks("1234-abc-5555-aaa-1a2b");
        replaceLetters("1234-abc-5555-aaa-1a2b");
        printLetters("1234-abc-5555-aaa-1a2b");
        printLettersUpperCase("1234-abc-5555-aaa-1a2b");
        existABC("1234-abc-5555-aaa-1a2b");
        documentBeginningCheck("5554-abc-5555-aaa-1a2b");
        documentEndingCheck("1234-abc-5555-aaa-1a2b");
        System.out.println("-------------------------------------");

        try {
            existABC("1234-abс-5555-aaa-1a2b");
        } catch (LetterSubsequenceException e) {
            System.out.println("Не соблюдена последовательность");
        }
        System.out.println("-------------------------------------");

        try {
            documentBeginningCheck("1234-abc-5555-aaa-1a2b");
        } catch (NumberSubsequenceException e) {
            System.out.println("Не соблюдена последовательность");
        }
        System.out.println("-------------------------------------");

        try {
            documentEndingCheck("1234-abc-5555-aaa-1a2a");
        } catch (EndingSubsequenceException e) {
            System.out.println("Не соблюдена последовательность");
        }
    }
}
