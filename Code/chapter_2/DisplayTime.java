import java.util.Scanner;

/**
 * DisplayTime
 */
public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a inteher for Seconds");
        int seconds = input.nextInt();

        int minutes = seconds / 60;
        int remaindSeconds = seconds % 60;

        input.close();
        System.out.println(seconds + " seconds " + minutes + " minutes and " + remaindSeconds + " seconds");

    }
}