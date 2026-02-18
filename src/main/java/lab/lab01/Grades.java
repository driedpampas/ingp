package lab.lab01;

import java.util.Map;

public class Grades {
    Map<Enrollment, Double> grades = new java.util.HashMap<>();

    public void setGrade(Enrollment enrollment, double grade) {
        if (grade < 0.0 || grade > 10.0) {
            IO.println("Grade must be between 0 and 10.");
        }
        grades.put(enrollment, grade);
    }

    public double getGrade(Enrollment enrollment) {
        return grades.get(enrollment);
    }

    public void printGrades() {
        for (Map.Entry<Enrollment, Double> entry : grades.entrySet()) {
            IO.println(String.format("Student ID: %s, Course: %s, Grade: %.2f",
                    entry.getKey().getStudentId(),
                    entry.getKey().getCourseName(),
                    entry.getValue()));
        }
    }
}
