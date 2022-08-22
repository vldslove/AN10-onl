package lesson11.part1;

import java.io.*;
import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) throws IOException {
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add("Hello");
        }

        arrayList.add(0,"bye");
        arrayList.add(5000000, "bye");
        arrayList.add(10000000, "bye");

        if (arrayList.contains("bye"))
            System.out.println("Элемент есть в списке");
        else
            System.out.println("Элемента нет в списке");

        System.out.println(arrayList.get(5000000));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(10000000));

        arrayList.remove(0);
        arrayList.remove(4999999);
        arrayList.remove(9999998);


        File result = new File("f://projects//helloworld//result.txt");
        FileWriter writer = new FileWriter(result);
        writer.write("Скорость работы ArrayList: " + System.currentTimeMillis() + "\n");
        writer.close();



        

















    }

}
