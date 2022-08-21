package lesson11.part1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) throws IOException {
        String result2;

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add("Hello");
        }

        linkedList.add(0, "bye");
        linkedList.add(5000000, "bye");
        linkedList.add(10000000, "bye");

        if (linkedList.contains("bye"))
            System.out.println("Элемент есть в списке");
        else
            System.out.println("Элемента нет в списке");

        System.out.println(linkedList.get(5000000));
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(10000000));

        linkedList.remove(0);
        linkedList.remove(4999999);
        linkedList.remove(9999998);


        result2 = "Скорость работы LinkedList: " + System.currentTimeMillis();
        Files.write(Paths.get("result.txt"), result2.getBytes(), StandardOpenOption.APPEND);


    }

}

