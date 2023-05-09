package lesson1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String word1 = scanner.next();

        System.out.println("Введите второе слово:");
        String word2 = scanner.next();

        int halfLength = word1.length() - 2;
        int halfLenght = word2.length() -0;
        String result1 = word2.substring( halfLength);
        String result2 = word2.substring(halfLength);

        System.out.println("word1" + result1);
        System.out.println("word2" + result2);



    }
}
