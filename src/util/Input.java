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
    int getInt(int min, int max) throws NumberFormatException {
        System.out.println("Enter a number between 1 and 10: ");
        try {
            String userInput = scanner.next();
            int intInput = Integer.parseInt(userInput);
            if (intInput >= min && intInput <= max) {
                return intInput;
            } else {
                return getInt(min, max);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input is not a number;");
            return getInt(min, max);
        }
    }
    double getDouble(int min, int max) {
        System.out.println("Enter a number between 1 and 10: ");
        String userInput = scanner.next();
        try {
            double doubleInput = Double.parseDouble(userInput);
            if (doubleInput >= min && doubleInput <= max) {
                return doubleInput;
            } else {
                return getDouble(min, max);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input is not a number;");
            return getDouble(min, max);
        }
    }
}
