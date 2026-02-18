package lab.lab01;

public class Enrollment {
    private String studentId;
    private String courseName;

    public Enrollment(String newStudentId, String newCourseName) {
        if (newStudentId == null || newCourseName == null || newStudentId.isEmpty() || newCourseName.isEmpty()) {
            IO.println("Student ID and course name cannot be empty or null.");
        }
        this.studentId = newStudentId;
        this.courseName = newCourseName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCourseName() {
        return courseName;
    }
}