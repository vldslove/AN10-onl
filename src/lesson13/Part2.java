package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part2 {
    public static void main(String[] args) {
        List<String> stringList = Stream.of("Artem", "Andrey", "Nadya", "Denis", "Elizaveta", "Evgeniy", "Ekaterina", "Ivan", "Aleksandr").collect(Collectors.toList());
        System.out.println(stringList.stream()
                .anyMatch("Vlad"::equals));
        System.out.println(Arrays.toString(stringList.stream()
                .filter((s -> s.substring(0,1).equalsIgnoreCase("a"))).toArray()));
        System.out.println(Arrays.toString(stringList.stream()
                .sorted()
                .limit(1).toArray()));

    }
}
