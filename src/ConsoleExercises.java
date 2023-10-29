import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f", pi );
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.print("Enter three words: ");
        String strings = scanner.next();
        String[] strArr = strings.split(" ");
        for (String str : strArr) {
            System.out.println(str);
        }
        System.out.print("Enter a sentence");
        String sentence = scanner.next();
        System.out.println(sentence);

        System.out.print("Enter a sentence");
        String sentenceNextline = scanner.nextLine();
        System.out.println(sentenceNextline);

        System.out.print("Enter width: ");
        float width = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter a height: ");
        float height = Float.parseFloat(scanner.nextLine());
        System.out.println("Area: " + (width * height));
        System.out.println("Perimeter: " + ((width + height)*2));

    }
}
