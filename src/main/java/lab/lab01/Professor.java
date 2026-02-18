package lab.lab01;

public class Professor extends Person {
    String title;

    Professor(String name, int age) {
        super(name, age);
        title = "Professor";
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return String.format("%s %s (%d years old)", getTitle(), getName(), getAge());
    }
}
