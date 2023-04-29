package lesson1;

public class Main {

    public static void main(String[] args) {

        int n = 365;
        int e = 10;
        int sum = 365 % 10;
        System.out.println(sum);

        System.out.println(n / 10 % 10);

        int  s = n / 100;
        int result = n / 10 / 10;
        System.out.println(result);

        }

    }