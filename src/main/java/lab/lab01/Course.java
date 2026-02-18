package lab.lab01;

public class Course extends Class {

    Course(String name) {
        super(name);
    }

    Course(String name, Professor professor) {
        super(name, professor);
    }

    public void start() {
        IO.println(String.format("Course %s is starting!", name));
    }

    public String requirements() {
        return "No requirements.";
    }
    public String getName() {
        return "Course name: " + name;
    }
}
