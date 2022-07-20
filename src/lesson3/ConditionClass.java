package lesson3;

public class ConditionClass {
    public static void main(String[] args) {

/*  Написать программу для вывода времени года по номеру месяца. Должно быть 2 варианта реализации: switch-case и if-else-if   */

// 1. Реализация с помощью switch-case.
        int month = 2;
        switch(month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }


// 2. Реализация с помощью if-else-if
    int month2 = 5;
    if (month2 == 3 || month2 == 4 || month2 == 5){
        System.out.println("Весна");
    } else if (month2 == 6 || month2 == 7 || month2 == 8){
        System.out.println("Лето");
    } else if (month2 == 9 || month2 == 10 || month2 == 11) {
        System.out.println("Осень");
    } else if (month2 == 12 || month2 == 1 || month2 == 2) {
        System.out.println("Зима");
    } else {
        System.out.println("Некорректное значение");
    }


// Напишите программу, которая будет принимать на вход число (можно задать явно в коде) и на выход будет выводить сообщение о четности числа.

    int number = 0;
    if (number % 2 == 0)
        System.out.println("Четное число");
    else
        System.out.println("Нечетное число");


/* Для числа t (температура на улице) вывести:
    Если t > 15, то вывести «Тепло»
    Если t <= 15 и t > -5, то вывести «Нормально»
    Если t <= 5, то вывести «Холодно»  */

        int t = -6;
        if (t > 15) {
            System.out.println("Тепло");
        } else if (t <= 15 && t > 5) {
            System.out.println("Нормально");
        } else if (t <= 5 ){
            System.out.println("Холодно");
        }


// По введенному (можно задать явно) номеру определить цвет радуги (1 – красный, 4 – зеленый и т.д.)

    int color = 5;
    switch(color) {
        case 1:
            System.out.println("Красный");
            break;
        case 2:
            System.out.println("Оранжевый");
            break;
        case 3:
            System.out.println("Желтый");
            break;
        case 4:
            System.out.println("Зеленый");
            break;
        case 5:
            System.out.println("Голубой");
            break;
        case 6:
            System.out.println("Синий");
            break;
        case 7:
            System.out.println("Фиолетовый");
            break;
        default:
            System.out.println("Некорректный номер");
    }

    }
}
