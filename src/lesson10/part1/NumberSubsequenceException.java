package lesson10.part1;

public class NumberSubsequenceException extends Exception{
    private String detail;

    public NumberSubsequenceException(){
        detail = " Incorrect number subsequence";
    }

    public NumberSubsequenceException(String message, String detail) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "NumberSubsequenceException" + detail;
    }
}
