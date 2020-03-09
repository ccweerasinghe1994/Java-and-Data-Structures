import java.util.Scanner;

/**
 * ComputeAreaWithConstant
 */
public class ComputeAreaWithConstant {

    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a radius");
        double radius = input.nextDouble();

        double area = radius * radius * PI;
        System.out.println("The Area of the circle with a " + radius + " of " + area);
    }
}