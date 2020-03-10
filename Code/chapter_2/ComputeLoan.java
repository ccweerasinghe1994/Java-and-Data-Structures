import java.util.Scanner;

/**
 * ComputeLoan
 */
public class ComputeLoan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please Enter a anual intrest rate");
        double anualIntrestRate = input.nextDouble();

        double monthlyIntrasrtRate = anualIntrestRate / 1200;

        System.out.println("Enter number of years as Integer");
        int numberofYears = input.nextInt();
        System.out.println("please enter a loan amount");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyIntrasrtRate
                / (1 - 1 / Math.pow(1 + monthlyIntrasrtRate, numberofYears * 12));
        double totalPayment = monthlyPayment * numberofYears * 12;

        System.out.println("The monthly payment is $" + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + (int) (totalPayment * 100) / 100.0);
        System.out.println();
    }
}