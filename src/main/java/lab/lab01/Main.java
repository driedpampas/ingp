package lab.lab01;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", 20, "123");
        Student student2 = new Student("David", 21);
        Student student3 = new Student("Maria", 19, "67");
        Student student4 = new Student("Ioana", 22);

        Professor professor1 = new Professor("Varlan", 40);
        professor1.setTitle("Dr.");
        Professor professor2 = new Professor("Ionescu", 45);
        professor2.setTitle("Prof.");
        Professor professor3 = new Professor("Popescu", 50);
        professor3.setTitle("Dr.");

        Class course1 = new Course("Software Engineering");
        Class course2 = new Course("Databases", professor1);
        Class course3 = new Course("Networks", professor2);
        Class course4 = new Course("Artificial Intelligence", professor3);

        Laboratory lab1 = new Laboratory();
        lab1.setName("SE Lab");
        lab1.setProfessor(professor1);

        Seminary sem1 = new Seminary();
        sem1.setName("Databases Seminary");
        sem1.setProfessor(professor2);

        Schedule schedule = new Schedule(5, 12);
        schedule.addClass(course1, 0, 8);
        schedule.addClass(course2, 0, 10);
        schedule.addClass(course3, 1, 8);
        schedule.addClass(course4, 1, 10);
        schedule.addClass(lab1, 2, 8, 3);
        schedule.addClass(sem1, 3, 9, 2);
        schedule.addClass(course1, 3, 10, 1);

        schedule.printSchedule();
        System.out.println(schedule.getConflicts());

        schedule.startClass(0, 8);
        System.out.println(course1.requirements());
        System.out.println(lab1.requirements());
        System.out.println(sem1.requirements());
        System.out.println(student1.getAge());

        Grades grades = new Grades();
        Enrollment enrollment1 = new Enrollment(student1.getId(), course1.getName());
        Enrollment enrollment2 = new Enrollment(student2.getId(), course2.getName());
        Enrollment enrollment3 = new Enrollment(student3.getId(), course3.getName());
        Enrollment enrollment4 = new Enrollment(student4.getId(), course4.getName());
        grades.setGrade(enrollment1, 9.5);
        grades.setGrade(enrollment2, 8.0);
        grades.setGrade(enrollment3, 7.5);
        grades.setGrade(enrollment4, 9.0);
        grades.printGrades();
    }
}
