package lab.lab01;

abstract class Class extends Activity{
    int timeStart, timeEnd;
    Professor professor;
    String name;
    abstract String requirements();
    abstract String getName();

    void setTimeStart(int timeStart) {
        if(timeStart <8 || timeStart > 18) {
            IO.println("Invalid time!");
            return;
        }
        this.timeStart = timeStart;
    }
    void setTimeEnd(int timeEnd) {
        if(timeEnd <9 || timeEnd > 20) {
            IO.println("Invalid time!");
            return;
        }
        this.timeEnd = timeEnd;
    }
    void setName(String name) {
        this.name = name;
    }
    void setProfessor(Professor professor) {
        this.professor = professor;
    }
    void getProfessor() {
        IO.println(String.format("Professor: %s", professor.name));
    }
    void printTime() {
        IO.println(String.format("Time: %d - %d", timeStart, timeEnd));
    }
}
