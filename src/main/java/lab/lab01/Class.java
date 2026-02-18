package lab.lab01;

abstract class Class extends Activity{
    int timeStart, timeEnd;
    Professor professor;
    String name;
    public abstract String requirements();
    public abstract String getName();

    public void setTimeStart(int timeStart) {
        if(timeStart <8 || timeStart > 18) {
            IO.println("Invalid time!");
            return;
        }
        this.timeStart = timeStart;
    }
    public void setTimeEnd(int timeEnd) {
        if(timeEnd <9 || timeEnd > 20) {
            IO.println("Invalid time!");
            return;
        }
        this.timeEnd = timeEnd;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void getProfessor() {
        IO.println(String.format("Professor: %s", professor.getName()));
    }
    public void printTime() {
        IO.println(String.format("Time: %d - %d", timeStart, timeEnd));
    }
}
