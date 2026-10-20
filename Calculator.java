public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static void run() {
        double a = 12;
        double b = 5;
        System.out.println("Результат: " + add(a, b));
    }
}
