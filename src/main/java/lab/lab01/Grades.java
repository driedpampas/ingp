package lab.lab01;

import java.util.Map;

public class Grades {
    Map<Enrollment, Double> grades;

    public void setGrade(Enrollment enrollment, double grade) {
        if (grade < 0.0 || grade > 10.0) {
            IO.println("Grade must be between 0 and 10.");
        }
        grades.put(enrollment, grade);
    }

    public double getGrade(Enrollment enrollment) {
        return grades.get(enrollment);
    }
}
