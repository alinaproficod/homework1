package lesson1;

public class Homeworc4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        System.out.println("Sum: " + sum(a, b));
        System.out.println("Substract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}
