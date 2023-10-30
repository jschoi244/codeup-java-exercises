package movies;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = -1;
        while (!(userInput == 0)) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.print("Enter your choice: ");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 0:
                    return;
                case 1:
                    for (Movie m: MoviesArray.findAll()) {
                        System.out.println("Title: " + m.getName());
                        System.out.println("Category: " + m.getCategory());
                    }
                    break;
                case 2:
                    for (Movie m: MoviesArray.findAll()) {
                        if (m.getCategory().equals("animated")) {
                            System.out.println("Title: " + m.getName());
                            System.out.println("Category: " + m.getCategory());
                        }
                    }
                    break;
                case 3:
                    for (Movie m: MoviesArray.findAll()) {
                        if (m.getCategory().equals("drama")) {
                            System.out.println("Title: " + m.getName());
                            System.out.println("Category: " + m.getCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie m: MoviesArray.findAll()) {
                        if (m.getCategory().equals("horror")) {
                            System.out.println("Title: " + m.getName());
                            System.out.println("Category: " + m.getCategory());
                        }
                    }
                    break;
                case 5:
                    for (Movie m: MoviesArray.findAll()) {
                        if (m.getCategory().equals("scifi")) {
                            System.out.println("Title: " + m.getName());
                            System.out.println("Category: " + m.getCategory());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
