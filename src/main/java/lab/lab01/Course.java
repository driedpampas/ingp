package lab.lab01;

public class Course extends Class {

    void start() {
        IO.println(String.format("Course %s is starting!", name));
    }

    String requirements() {
        return "No requirements.";
    }
    String getName() {
        return "Course name: " + name;
    }
}
