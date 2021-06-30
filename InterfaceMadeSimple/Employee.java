package advancedJava.Lab2;

public abstract class Employee implements Payable{
    private String cnic;
    private String name;

    public Employee(String cnic, String name) {
        this.cnic = cnic;
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
