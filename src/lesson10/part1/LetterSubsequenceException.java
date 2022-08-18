package lesson10.part1;

public class LetterSubsequenceException extends Exception{
    private String detail;

    public LetterSubsequenceException() {
        detail = " Incorrect letter subsequence";
    }

    public LetterSubsequenceException(String message, String detail) {
        super(message);
        this.detail = detail;
    }


    @Override
    public String toString() {
        return "LetterSubsequenceException" + detail;
    }
}
