package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Part1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add((int) (Math.random() * 100));

        }
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers.stream()
                .distinct().toArray()));
        System.out.println(Arrays.toString(numbers.stream()
                .filter(num -> num % 2 == 0)
                .skip(7)
                .limit(17).toArray()));
        System.out.println(Arrays.toString(numbers.stream()
                .mapToInt(num -> num * 2).toArray()));
        System.out.println(Arrays.toString(numbers.stream()
                .sorted()
                .limit(4).toArray()));
        System.out.println((long) numbers.size());
        System.out.println(numbers.stream()
                .mapToInt((num) -> Integer.parseInt(String.valueOf(num))).average());








            
        }
        






}

