package lab.lab01;

public class Student extends Person {
    private String id;

    Student(String name, int age) {
        super(name, age);
    }

    Student(String name, int age, String newId){
        super(name, age);
        id = newId;
    }

    public String getDescription() {
        return String.format("Student %s (%d years old)", getName(), getAge());
    }
}
