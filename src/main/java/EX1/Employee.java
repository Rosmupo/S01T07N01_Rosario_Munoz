package EX1;

public class Employee {

    String name;
    String surname;
    double pricePerHour;

    public Employee(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double calculateSalary(int hours){
        double salary = hours * pricePerHour;
        return salary;
    }

}
