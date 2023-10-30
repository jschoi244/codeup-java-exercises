public class Person {
    private String name;
    public Person() {
        this.name = "Default";
    }
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Justin");
        System.out.println(p.getName());
        p.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
