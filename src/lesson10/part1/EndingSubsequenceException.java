package lesson10.part1;

public class EndingSubsequenceException extends Exception{
    private String detail;

    public EndingSubsequenceException(){
        detail = " Incorrect ending subsequence";
    }

    public EndingSubsequenceException(String message, String detail) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "EndingSubsequenceException" + detail;
    }
}
