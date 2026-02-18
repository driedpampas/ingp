package lab.lab01;

abstract class Person {
    private final String name;
    private int age;
    private int income;

    Person(String name, int age) {
        this.name = name;
        if (age < 0 || age > 150) {
            System.out.println("Invalid age. Age must be between 0 and 150.");
            this.age = 0; //default 0
        }
        else {
            this.age = age;
        }
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
        if(newAge < 0||newAge > 150) {
            System.out.println("Invalid age. Age must be between 0 and 150.");
            return;
        }
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    abstract String getDescription();
}
