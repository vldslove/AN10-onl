package lesson10.part1;

public class DocumentMethods {
    public static void firstTwoBlocks(String documentNumber){
        System.out.println(documentNumber.replace(documentNumber.substring(5,8),"***").replace(documentNumber.substring(14,17), "***"));
    }

    public static void replaceLetters(String documentNumber){
        System.out.println(documentNumber.substring(0,4) + " " + documentNumber.substring(9,13));
    }

    public static void printLetters(String documentNumber){
        System.out.println(String.join("/", documentNumber.substring(5,8), documentNumber.substring(14,17), documentNumber.substring(19,20), documentNumber.substring(21,22)));

    }

    public static void printLettersUpperCase(String documentNumber){
        StringBuilder sb = new StringBuilder(documentNumber);
        System.out.println("Letter:" + String.join("/", sb.substring(5,8), sb.substring(14,17), sb.substring(19,20), sb.substring(21,22)).toUpperCase());

    }

    public static boolean existABC(String documentNumber) throws LetterSubsequenceException {
        if (documentNumber.contains("abc")) {
            System.out.println("Документ содержит последовательность abc");

        } else {
            System.out.println("Документ не содержит последовательность abc");
            throw new LetterSubsequenceException();
        }
        return true;
    }


    public static boolean documentBeginningCheck(String documentNumber) throws NumberSubsequenceException {
        if (documentNumber.substring(0,4).contains("555")){
            System.out.println("Документ начинается с 555");
        }else {
            System.out.println("Документ не начинается с 555");
            throw new NumberSubsequenceException();
        }
        return true;
    }

    public static boolean documentEndingCheck(String documentNumber) throws EndingSubsequenceException {
        if (documentNumber.substring(18,22).contains("1a2b")){
            System.out.println("Документ заканчивается на 1a2b");
        }else {
            System.out.println("Документ не заканчивается на 1a2b");
            throw new EndingSubsequenceException();
        }

        return true;
    }



}
