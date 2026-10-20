public class ParityChecker {
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static void run() {
        System.out.println("7 нечётное: " + isOdd(7));
        System.out.println("-3 нечётное: " + isOdd(-3));
    }
}
