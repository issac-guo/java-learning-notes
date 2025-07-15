public class PartTimeEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString(){
        return super.toString() + ",工资:" + calculatePay();
    }
}
