package advancedJava.Lab2;

public class Invoices implements Payable {
    private int quantity;
    private double price;
    private String description;

    public Invoices(int quantity, double price, String description) {
        this.quantity = quantity;
        this.price = price;
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getPayableAmount() {
        return quantity*price;
    }
}
