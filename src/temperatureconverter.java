import java.util.Scanner;
public class temperatureconverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius , fahrenheit , kelvin;
        System.out.println("Enter the temperature in celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;
        kelvin = celsius + 273.15;

        System.out.println("Temperature in fahrenheit :" + fahrenheit);
        System.out.println("Temperature in kelvin :" + kelvin);
    }
}
