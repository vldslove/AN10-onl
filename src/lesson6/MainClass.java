package lesson6;

public class MainClass {
    public static void main(String[] args) {
        CreditCard creditcard1 = new CreditCard(1,100);
        CreditCard creditcard2 = new CreditCard(2,200);
        CreditCard creditcard3 = new CreditCard(3,300);
        creditcard1.accountInfo();
        creditcard2.accountInfo();
        creditcard3.accountInfo();

        creditcard1.replenishBalance(200);
        creditcard2.replenishBalance(400);
        creditcard3.withdrawAmount(200);
        creditcard1.accountInfo();
        creditcard2.accountInfo();
        creditcard3.accountInfo();

    }
}
