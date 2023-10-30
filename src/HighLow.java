import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * (100 - 1)) + 1;
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number or 'exit' to quit: ");
            userInput = scanner.next();

            if (userInput.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user enters "exit"
            }

            try {
                int number = Integer.parseInt(userInput);
                if (number == randomNumber) {
                    System.out.println("Good Guess!");
                    return;
                } else if (number < randomNumber) {
                    System.out.println("HIGHER");
                } else {
                    System.out.println("LOWER");
                }
                // You can use the 'number' variable here
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
