package lab.lab01;

public class Seminary extends Class {
    public void start() {
        IO.println(String.format("Seminary %s is starting!", name));
    }

    public String requirements() {
        return "Requirements: pen and paper.";
    }
    public String getName() {
        return "Seminary name: " + name;
    }
}
