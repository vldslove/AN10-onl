package lesson8;

public class DirectorClass implements Printable{

    @Override
    public void post(String post) {
        System.out.println("Должность - " + post);
    }
}
