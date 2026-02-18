package lab.lab01;

public class Laboratory extends Class {
    void start() {
        IO.println(String.format("Laboratory %s is starting!", name));
    }

    String requirements() {
        return "Requirements: laptop.";
    }
    String getName() {
        return "Laboratory name: " + name;
    }
}
