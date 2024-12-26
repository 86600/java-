package javapackage;
import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose the conversion you want to perform:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");

        System.out.print("Enter your choice (1-6): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature to convert: ");
        double inputTemperature = scanner.nextDouble();
        double convertedTemperature = 0;

        switch (choice) {
            case 1: // Celsius to Fahrenheit
                convertedTemperature = (inputTemperature * 9/5) + 32;
                System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", inputTemperature, convertedTemperature);
                break;
            case 2: // Fahrenheit to Celsius
                convertedTemperature = (inputTemperature - 32) * 5/9;
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", inputTemperature, convertedTemperature);
                break;
            case 3: // Celsius to Kelvin
                convertedTemperature = inputTemperature + 273.15;
                System.out.printf("%.2f Celsius is %.2f Kelvin.%n", inputTemperature, convertedTemperature);
                break;
            case 4: // Kelvin to Celsius
                convertedTemperature = inputTemperature - 273.15;
                System.out.printf("%.2f Kelvin is %.2f Celsius.%n", inputTemperature, convertedTemperature);
                break;
            case 5: // Fahrenheit to Kelvin
                convertedTemperature = (inputTemperature - 32) * 5/9 + 273.15;
                System.out.printf("%.2f Fahrenheit is %.2f Kelvin.%n", inputTemperature, convertedTemperature);
                break;
            case 6: // Kelvin to Fahrenheit
                convertedTemperature = (inputTemperature - 273.15) * 9/5 + 32;
                System.out.printf("%.2f Kelvin is %.2f Fahrenheit.%n", inputTemperature, convertedTemperature);
                break;
            default:
                System.out.println("Invalid choice. Please restart the program and choose a valid option.");
                break;
        }

        scanner.close();
    }
}
