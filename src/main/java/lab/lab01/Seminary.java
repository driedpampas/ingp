package lab.lab01;

public class Seminary extends Class {
    void start() {
        IO.println(String.format("Seminary %s is starting!", name));
    }

    String requirements() {
        return "Requirements: pen and paper.";
    }
    String getName() {
        return "Seminary name: " + name;
    }
}
