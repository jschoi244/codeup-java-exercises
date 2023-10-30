package util;
import java.util.Scanner;
public class Input {
    private final Scanner scanner;
    public Input() {
        scanner = new Scanner(System.in);
    }
    public String getString() {
        System.out.print("Enter a string: " );
        return scanner.next();
    }
    boolean yesNo() {
        System.out.print("Enter yes or no: " );
        return scanner.next().equalsIgnoreCase("yes");
    }
    int getInt(int min, int max) {
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            return getInt(min, max);
        }
    }
    double getDouble(int min, int max) {
        System.out.println("Enter a number between 1 and 10: ");
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            return getDouble(min, max);
        }
    }
}
