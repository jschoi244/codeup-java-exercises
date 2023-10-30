package shapes;
import java.util.Scanner;
public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        Circle c = new Circle(scanner.nextDouble());
        System.out.println("The area of a circle with radius: " + c.getRadius() + " is " + c.getArea());
        System.out.println("The area of a circle with radius: " + c.getRadius() + " is " + c.getCircumference());
    }

}
