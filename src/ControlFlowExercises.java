import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        double i = 2;
//        do {
//            System.out.println(i);
//            i = Math.pow(i, 2);
//        } while (i < 1000000);

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (double i = 2; i < 1000000; i = Math.pow(i, 2)) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        boolean continueProgram = true;
//
//        while (continueProgram) {
//            System.out.print("Enter an integer: ");
//            int value = scanner.nextInt();
//
//            System.out.println("Number | Square | Cube");
//            System.out.println("---------------------");
//
//            for (int i = 1; i <= value; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//                System.out.printf("%6d | %6d | %4d%n", i, square, cube);
//            }
//
//            System.out.print("Do you want to continue (yes/no)? ");
//            scanner.nextLine(); // Consume the newline character
//            String response = scanner.nextLine().toLowerCase();
//
//            if (!response.equals("yes")) {
//                continueProgram = false;
//            }
//        }
//
//        System.out.println("Program terminated.");

        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Enter a numerical grade (0-100): ");
            int grade = scanner.nextInt();

            char letterGrade;

            if (grade >= 88 && grade <= 100) {
                letterGrade = 'A';
            } else if (grade >= 80 && grade <= 87) {
                letterGrade = 'B';
            } else if (grade >= 67 && grade <= 79) {
                letterGrade = 'C';
            } else if (grade >= 60 && grade <= 66) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter grade: " + letterGrade);

            System.out.print("Do you want to continue (yes/no)? ");
            scanner.nextLine(); // Consume the newline character
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("yes")) {
                continueProgram = false;
            }
        }


    }
}
