package lesson12;

import java.util.Objects;

public class WorkerCard {
    private String name;
    private int age;
    private Report report;
    private int cardNumber;
    private String cardCreationDate;
    private boolean signature;

    public WorkerCard(String name, int age, Report report, int cardNumber, String cardCreationDate, boolean signature) {
        this.name = name;
        this.age = age;
        this.report = report;
        this.cardNumber = cardNumber;
        this.cardCreationDate = cardCreationDate;
        this.signature = signature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerCard that = (WorkerCard) o;
        return age == that.age && cardNumber == that.cardNumber && signature == that.signature && Objects.equals(name, that.name) && Objects.equals(report, that.report) && Objects.equals(cardCreationDate, that.cardCreationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, report, cardNumber, cardCreationDate, signature);
    }

    @Override
    public String toString() {
        return "Карта работника:" +
                "Имя: " + name +
                ", Возраст: " + age +
                ", Отчет: " + report +
                ", Номер карты: " + cardNumber +
                ", Дата создания карты: " + cardCreationDate + '\'' +
                ", Подпись: " + signature + '\'' +
                '}';
    }
}
