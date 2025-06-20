import java.util.Scanner;

public class Q12_TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion: 1) F to C  2) C to F");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = scanner.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(f));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double c = scanner.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
} 