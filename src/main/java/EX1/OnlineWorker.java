package EX1;

public class OnlineWorker extends Employee {

    int numHourPerMonth;
    final int INTERNET_FLAT_RATE;

    public OnlineWorker(String name, String surname, double pricePerHour, int numHourPerMonth) {
        super(name, surname, pricePerHour);
        this.numHourPerMonth = numHourPerMonth;
        INTERNET_FLAT_RATE = 50;
    }

    @Override
    public double calculateSalary(int numHourPerMonth) {
        double salary = INTERNET_FLAT_RATE + super.calculateSalary(this.numHourPerMonth);
        return salary;
    }

    public int getNumHourPerMonth() {
        return numHourPerMonth;
    }

}
