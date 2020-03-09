import java.util.Scanner;

/**
 * FahrenheitToCelsius
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Faranhieght");
        double Faranhite = input.nextDouble();
        double celciues = (5.0 / 9) * Faranhite;
        System.out.println("Faranhite " + Faranhite + " in celciues " + celciues);
    }
}