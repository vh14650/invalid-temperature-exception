import java.util.Scanner;

class InvalidTemperatureException extends Exception {
    InvalidTemperatureException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temp = sc.nextDouble();

        try {
            if (temp < -273.15) {
                throw new InvalidTemperatureException("Invalid Temperature!");
            }

            System.out.println("Valid Temperature: " + temp + " °C");
        } 
        catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
