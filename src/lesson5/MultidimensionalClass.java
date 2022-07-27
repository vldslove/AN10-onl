package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalClass {
    public static void main(String[] args) {

//     Создайте трехмерный массив из целых чисел. С помощью циклов «пройти» по всему массиву и увеличить каждый элемент на заданное число.
//     Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.

        int[][][] array1 = {{{1,2}, {3,4}}, {{5,6}, {7,8}}};
        System.out.println(Arrays.deepToString(array1));
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array1[i][j].length; k++) {
                    array1[i][j][k] += number;

                }
            }
        }
        System.out.println(Arrays.deepToString(array1));



//     Шахматная доска. Создайте программу для раскраски шахматной доски с помощью цикла. Использовать двумерный массив String размером 8х8.
//     С помощью циклов задать элементам значения B (Black) или W (White).

        String[][] array2 = new String[8][8];

        for (int i = 0; i < array2.length; i++) {
            System.out.println();
            for (int j = 0; j < array2[i].length; j++) {
             if ((i+j) % 2 == 1){
                 array2[i][j] = "B";
             } else {
                 array2[i][j] = "W";
             }
             System.out.print(array2[i][j] + " ");

          }
        }
    }
}
