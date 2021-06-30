package advancedJava.Lab4CreatingCustomExceotion;

public class InvalidCGPAException  extends Exception{
    private double invalidValue;

    public InvalidCGPAException(double invalidValue){
        this.invalidValue=invalidValue;
    }

    public double getInvalidValue() {
        return invalidValue;
    }

    public void setInvalidValue(double invalidValue) {
        this.invalidValue = invalidValue;
    }
}
