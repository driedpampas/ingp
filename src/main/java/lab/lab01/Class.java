package lab.lab01;

abstract class Class implements Activity{
    int timeStart, timeEnd;
    Professor professor;
    String name;

    public Class() {
        name = "Unknown";
        professor = new Professor("Unknown", 0);
    }

    public Class(String name) {
        this.name = name;
        professor = new Professor("Unknown", 0);
    }

    public Class(String name, Professor professor) {
        this.name = name;
        this.professor = professor;
    }

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
