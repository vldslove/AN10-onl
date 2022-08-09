package lesson8;

public class AccountantClass implements Printable{

    @Override
    public void post(String post) {
        System.out.println("Должность - " + post);
    }
}
