package lab.lab01;

public class Student extends Person {
    Student(String name, int age) {
        super(name, age);
    }

    public String getDescription() {
        return String.format("Student %s (%d years old)", getName(), getAge());
    }
}
