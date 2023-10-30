package grades;
import java.util.*;
import java.util.Scanner;
public class GradesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Student> students = new HashMap<>();
        students.put("s1", new Student("s1"));
        students.put("s2", new Student("s2"));
        students.put("s3", new Student("s3"));
        students.put("s4", new Student("s4"));
        for (Student student : students.values()) {
            student.addGrade(90);
            student.addGrade(80);
            student.addGrade(70);
            System.out.println(student.getName());
        }
        System.out.println("Here are the GitHub usernames of our students: ");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
            System.out.println();
        }
        String userInput = "";
        while (!userInput.equalsIgnoreCase("no")) {
            System.out.print("What student would you like to see more information on?");
            userInput = sc.next();
            if (students.containsKey(userInput)) {
                Student s = students.get(userInput);
                System.out.println("Name: " + s.getName() + " - GitHub Username: " + userInput);
                System.out.println("Current average: " + s.getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of \"" + userInput +  "\"." );
                System.out.print("Would you like to see another student?");
                userInput = sc.next();
            }
        }


    }
}
