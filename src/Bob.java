import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] responses = {"Sure", "Whoa, chill out!", "Fine. Be that way!", "Whatever"};
        String userInput = "";
        while (!userInput.equalsIgnoreCase("no")) {
            System.out.print("Talk to Bob: ");
            userInput = scanner.nextLine().toLowerCase();
            if (userInput.contains("?")) {
                System.out.println("Bob: " + responses[0]);
            } else if (userInput.contains("!")) {
                System.out.println("Bob: " + responses[1]);
            } else if (userInput.isEmpty()) {
                System.out.println("Bob: " + responses[2]);
            } else {
                System.out.println("Bob: " + responses[3]);
            }
            System.out.print("Do you want to continue (yes/no)? ");
            userInput = scanner.nextLine().toLowerCase();
        }
    }
}
