package EX2;

public class FaceToFaceWorker extends Employee {

    int numHourPerMonth;
    static int fuel;

    public FaceToFaceWorker(String name, String surname, double pricePerHour, int numHourPerMonth) {
        super(name, surname, pricePerHour);
        this.numHourPerMonth = numHourPerMonth;
        fuel = 10;
    }

    public int getNumHourPerMonth() {
        return numHourPerMonth;
    }

    @Override
    public double calculateSalary(int numHourPerMonth){
        double salary = fuel + super.calculateSalary(numHourPerMonth);
        return salary;
    }

    @Deprecated
    public int sum (int a, int b){
        return a+b;
    }

    public double sum(double a, double b){
        return a+b;
    }
}
