package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
    public static void main(String[] args) {

//  Создайте массив целых чисел. Напишите программу, которая выводит сообщение о том,входит ли заданное число в массив или нет. Пусть число для поиска задается с консоли
//  (класс Scanner).

       int[] array1 = new int[10];
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите число");
       int number = scanner.nextInt();

       for (int i = 0; i < array1.length; i++) {
            if (number == i && number != 0) {
               System.out.println("Заданное число входит в массив");
               break;
          } else if (i == array1.length -1) {
                System.out.println("Заданного числа нет в массиве");
            }
        }



//  Создайте массив целых чисел. Удалите все вхождения заданного числа из массива. Пусть число задается с консоли (класс Scanner). Если такого числа нет – выведите сообщение
//  об этом.

        int[] array2 = new int[] {4, 5, 9, 12, 4, 7, 4, 2};
        System.out.println(Arrays.toString(array2));
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите число");
        int number2 = scanner2.nextInt();
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == number2){
                array2[i] *= 0;
                break;
            } else if (i == array2.length -1) {
            System.out.println("Заданного числа нет в массиве"); }
        }

        System.out.println(Arrays.toString(array2));


//  Создайте и заполните массив случайными числами и выведите минимальное, максимальное и среднее значение. Для генерации случайного числа используйте метод Math.random().
//  Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.

        System.out.println("Введите размер массива");
        Scanner scanner3 = new Scanner(System.in);
        int size = scanner3.nextInt();
        int[] array3 = new int[size];
        int min;
        int max;
        float average = 0;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 100);
            average += (float) array3[i] / array3.length;
        }
        Arrays.sort(array3);
        min = array3[0];
        max = array3[array3.length -1];
        System.out.println("Минимальное: " + min);
        System.out.println("Максимальное: " + max);
        System.out.println("Среднее: " + average);
        System.out.println(Arrays.toString(array3));

//  Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого
//  из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

        int[] array4 = new int[5];
        int[] array5 = new int[5];
        float average4 = 0;
        float average5 = 0;
        for (int i = 0; i < array4.length; i++){
            array4[i] = (int) (Math.random() * 100);
            average4 += (float) array4[i] / array4.length;
        }
        for (int j = 0; j < array5.length; j++){
            array5[j] = (int) (Math.random() * 100);
            average5 += (float) array5[j] / array5.length;
        }
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(array5));
        System.out.println("Среднее первого массива: " + average4);
        System.out.println("Среднее второго массива: " + average5);
        if (average4 > average5) {
            System.out.println(average4 + " > " + average5);
        } else System.out.println(average4 + " < " + average5);
        if (average4 == average5) System.out.println(average4 + " = " + average5);

    }
}
