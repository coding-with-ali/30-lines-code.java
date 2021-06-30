package advancedJava.Lab2;

public class ContractEmployee extends Employee {
    private int hours;
    private double wagePerHour;

    public ContractEmployee(String cnic, String name, int hours, double wagePerHour) {
        super(cnic, name);
        this.hours = hours;
        this.wagePerHour = wagePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    @Override
    public double getPayableAmount() {
        return hours*wagePerHour;
    }
}
