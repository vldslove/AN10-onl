package lesson3;

import java.util.Scanner;

public class CycleClass {
    public static void main(String[] args) {

// При помощи цикла for вывести на экран нечетные числа от 1 до 99 (использовать инкремент)

        for (int i = 0; i < 100; i++) {
        if (i % 2 !=0) {
            System.out.println(i);
        }
    }


// При помощи цикла for вывести на экран числа от 15 до 1 (использовать декремент)

    for (int i = 15; i > 0; i--) {
        System.out.println(i);
    }


// Напишите программу, где пользователь вводит любое целое положительное число - N. Программа суммирует все числа от 1 до N. Для ввода числа используйте класс Scanner.

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 1, sum = 0; i < number; i++) {
            System.out.println(sum+=i);
       }



// Напишите программу, которая будет выводить на экран такую последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98 В решении использовать цикл while

      int i = 0;
      while (i < 98) {
          System.out.println(i+=7);
      }


// Вывести 10 первых чисел последовательности 0, -5, -10, -15… -45

        for (int j = 0; j > -50; j-=5) {
            System.out.println(j);
        }


// Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

        for (int k = 10, j = 10; k <= 20 && j <= 20; k++, j++) {
            System.out.println(k*j);


    }
}
}
