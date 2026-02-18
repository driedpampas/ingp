package lab.lab01;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 20);
        Student student2 = new Student("David", 21);

        Professor professor1 = new Professor("Varlan", 40);
        professor1.setTitle("Dr.");

        Class course1 = new Course("Software Engineering");
        Class course2 = new Course("Databases", professor1);

        Schedule schedule = new Schedule(5, 12);
        schedule.addClass(course1, 0, 8);
        schedule.addClass(course2, 0, 8);

    }
}
