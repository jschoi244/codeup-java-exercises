package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Justin");
        s1.addGrade(90);
        s1.addGrade(100);
        s1.addGrade(70);
        System.out.println(s1.getGradeAverage());
    }
}
