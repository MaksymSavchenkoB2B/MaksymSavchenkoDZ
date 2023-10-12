import java.util.Scanner;

public class ConverterTemperature {
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsiusToKelvin(celsius);
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println(celsius + " degrees Celsius =  " + kelvin + " Kelvins");
        System.out.println(celsius + " degrees Celsius =  " + fahrenheit + " Fahrenheits");

    }
}
