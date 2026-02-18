package lab.lab01;

public class Laboratory extends Class {
    public void start() {
        IO.println(String.format("Laboratory %s is starting!", name));
    }

    public String requirements() {
        return "Requirements: laptop.";
    }
    public String getName() {
        return "Laboratory name: " + name;
    }
}
