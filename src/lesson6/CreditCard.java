package lesson6;
//     Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//     Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//     Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//     Добавьте метод, который выводит текущую информацию о карточке.
//     Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.

public class CreditCard {
    long accountnumber;
    int accountbalance;

    CreditCard(long accountnumber, int accountbalance) {
        this.accountnumber = accountnumber;
        this.accountbalance = accountbalance;
    }

    public void replenishBalance(int amount){
        if (amount < 0) {
            System.out.println("Некорректное значение");
        } else {
            accountbalance += amount;
            System.out.println("Баланс обновлен");
        }
    }

    public void withdrawAmount(int amount) {
        if (amount < 0 ) {
            System.out.println("Некорректное значение");
        } else {
            accountbalance -= amount;
            System.out.println("Баланс обновлен");
        }
    }


    public void accountInfo(){
        System.out.println("Номер счета - " + accountnumber + " Текущий баланс - " + accountbalance + "$");
    }



}