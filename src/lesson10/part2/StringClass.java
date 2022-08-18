package lesson10.part2;

import java.util.Arrays;

public class StringClass {

    private static int minNumberOfDistinctCharacters(String letter){
        StringBuffer u = new StringBuffer();
        String current;
        for (int i = 0; i < letter.length(); i++) {
            current = String.valueOf(letter.charAt(i));
            if (u.indexOf(current)==-1)
                u.append(current);
        }

        return u.length();
    }


    public static void main(String[] args) {

//        Дана строка произвольной длины с произвольными словами.
//        Найти самое короткое слово в строке и вывести его на экран.
//        Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько,
//        то вывести последнее из них.

        String[] s1 = new String[] {"one" , "two" , "three", "four", "five", "seven" };
        String shortWord = s1[0];
        String longWord = s1[0];
        for (int s = 0; s < s1.length; s++) {
            if (shortWord.length() >= s1[s].length()) {
                shortWord = s1[s];

            } else if (longWord.length() <= s1[s].length()) {
                longWord = s1[s];
            }
        }
        System.out.println(Arrays.toString(s1));
        System.out.println(shortWord);
        System.out.println(longWord);

//        Дана строка произвольной длины с произвольными словами.
//        Найти слово, в котором число различных символов минимально.
//        Слово может содержать буквы и цифры. Если таких слов несколько, найти первое из них.

        String[] a = {"fffre", "werwer", "aa3a", "rewrwe", "111111"};
        String result = a[0];
        System.out.println("Массив: " + Arrays.toString(a));
        for (int i = 1; i < a.length; i++) {
            if (minNumberOfDistinctCharacters(a[i]) < minNumberOfDistinctCharacters(result))
                result = a[i];
        }
        System.out.println("");
        System.out.println("Слово с минимальным количеством различных символов: " + result);


//        Дана строка произвольной длины с произвольными словами.
//        Написать программу для проверки является ли любое выбранное слово в строке палиндромом.

        String[] variable = new String[]{"Шалаш", "Палач", "Талат"};

        for (String v : variable) {
            StringBuffer reverse = new StringBuffer(v).reverse();
            String strReverse = reverse.toString();
            if (v.equalsIgnoreCase(strReverse)) {
                System.out.println("Слово " + v + " палиндром");
            } else System.out.println("Слово " + v + " непалиндром");

        }


//        Дана произвольная строка. Вывести на консоль новую строку, которой задублирована каждая буква из
//        начальной строки.

        String word = "Слово";
        StringBuilder sb2 = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb2.append(c);
            sb2.append(c);
        }
        System.out.println(sb2);


    }
}
