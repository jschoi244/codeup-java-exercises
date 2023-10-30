import java.util.Scanner;
public class MethodsExercises {
    public static double add(double x, double y) {
        return x + y;
    }
    public static double subtract(double x, double y) {
        return x - y;
    }
    public static double multiply(double x, double y) {
        return x * y;
    }
    public static double divide(double x, double y) {
        return x / y;
    }
    public static double mod(double x, double y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Enter a number between 1 and 10: ");
            return getInteger(min, max);
        }
    }
    public static int calculateFactorial(int num) {
        int product = 1;
        while (num > 0) {
            product *= num;
            num--;
            System.out.println(num);
        }
        return product;
    }
    public static void getFactorial() {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        while (!userInput.equalsIgnoreCase("no")) {
            System.out.println("Enter a number between 1 and 10: ");
            System.out.println(calculateFactorial(getInteger(1,10)));
            System.out.print("Do you want to continue (yes/no)? ");
            userInput = scanner.nextLine().toLowerCase();
        }
    }
    public static void rollDice(int sides) {
        System.out.println("Rolled die: " + (int) ((Math.random() * (sides - 1)) + 1) + ", " + (int) ((Math.random() * (sides - 1)) + 1));
    }
    public static void dice() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Enter number for sides of dice: ");
        userInput = scanner.nextInt();
        String strInput = "";
        while (!strInput.equalsIgnoreCase("no")) {
            System.out.println("Would you like to roll the dice?");
            rollDice(userInput);
            System.out.print("Do you want to roll again?");
            strInput = scanner.nextLine().toLowerCase();
        }

    }
    public static void main(String[] args) {
//        double x = 2;
//        double y = 4;
//        System.out.println(add(x,y));
//        System.out.println(subtract(x,y));
//        System.out.println(multiply(x,y));
//        System.out.println(divide(x,y));
//        System.out.println(mod(x,y));
//
//        System.out.println("Enter a number between 1 and 10: ");
//        System.out.println(getInteger(1, 10));
//
//        getFactorial();
        dice();
    }
}
