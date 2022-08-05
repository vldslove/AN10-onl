package lesson7;

public class MainClass {
    public static void main(String[] args) {
        Phone phone1 = new Phone(12345, "iPhone", 400);
        Phone phone2 = new Phone(54321, "Xiaomi", 300);
        Phone phone3 = new Phone(13579,"Samsung", 500);


        System.out.println("Номер: " + phone1.number + " Модель: " + phone1.model + " Вес: " +phone1.weight);
        System.out.println("Номер: " + phone2.number + " Модель: " + phone2.model + " Вес: " +phone2.weight);
        System.out.println("Номер: " + phone3.number + " Модель: " + phone3.model + " Вес: " +phone3.weight);

        phone1.receiveCall(" Алексей");
        phone1.getNumber();
        phone2.receiveCall(" Андрей");
        phone2.getNumber();
        phone3.receiveCall(" Александр");
        phone3.getNumber();

        phone1.receiveCall(" Алексей", phone1.number);
        phone1.receiveCall(" Андрей", phone2.number);
        phone1.receiveCall(" Александр", phone3.number);

        phone1.sendMessage("Привет.", new int[] {198432, 473281});



    }
}
