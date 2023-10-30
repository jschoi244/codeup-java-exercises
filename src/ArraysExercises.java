import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person p, Person[] pArray) {
        Person[] newArray = new Person[pArray.length + 1];
        for (int i = 0; i <= pArray.length; i++) {
            if (i == pArray.length) {
                newArray[i] = p;
            } else {
                newArray[i] = pArray[i];
            }
        }
        return newArray;
    }
    // Using library method
//    public static Person[] addPerson(Person p, Person[] pArray) {
//        Person[] newArray = Arrays.copyOf(pArray, pArray.length + 1);
//        newArray[newArray.length - 1] = p;
//        return newArray;
//    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] persons = new Person[3];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }
        persons = addPerson(new Person("Justin"), persons);
        for (Person p : persons) {
            System.out.println(p.getName());
        }
    }
}
