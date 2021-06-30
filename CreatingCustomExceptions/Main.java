package advancedJava.Lab4CreatingCustomExceotion;

public class Main {
    
    public static void main(String[] args){
        try {
            checkLaptopEligibility(4);
        } catch (InvalidCGPAException e) {
            e.printStackTrace();
        }

    }

    public static void checkLaptopEligibility (double cgpa) throws InvalidCGPAException {
        boolean eligiblity = false;

        if (cgpa>=4 || cgpa <0){
            throw new InvalidCGPAException(cgpa);
        }
        if (cgpa>=3){
            eligiblity=true;
        }
    }
}
