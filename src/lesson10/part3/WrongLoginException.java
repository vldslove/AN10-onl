package lesson10.part3;

public class WrongLoginException extends Exception{
    private String detail;

    public WrongLoginException() {
        detail = "Incorrect login";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + detail;
    }
}
