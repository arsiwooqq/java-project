public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void run() {
        System.out.println("25 C = " + celsiusToFahrenheit(25) + " F");
    }
}
