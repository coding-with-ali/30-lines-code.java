package advancedJava.Lab2;

public class RegularEmplyee extends Employee{
    private int salary;

    public RegularEmplyee(String cnic, String name, int salary) {
        super(cnic, name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double getPayableAmount() {
        return salary;
    }
}
