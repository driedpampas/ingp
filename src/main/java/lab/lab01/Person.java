package lab.lab01;

abstract class Person {
    private final String name;
    private int age;
    private int income;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setIncome(int newIncome) {
        income = newIncome;
    }

    public int getIncome() {
        return income;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    abstract String getDescription();
}
