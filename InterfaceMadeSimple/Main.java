package advancedJava.Lab2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Invoices invoices = new Invoices(3,3000,"Engine");
        double enginesPayment=invoices.getPayableAmount();
        System.out.println("Engines Payment:"+ enginesPayment);

        ContractEmployee contractEmployee= new ContractEmployee("1200108","Ali",3,300);
        double cntsalary = contractEmployee.getPayableAmount();
        System.out.println("Contract Employee Salary :"+cntsalary);

        RegularEmplyee regularEmplyee= new RegularEmplyee("232234","jawad",30000);
        double regsalary= regularEmplyee.getPayableAmount();
        System.out.println("Regular Employee Salary :" +regsalary);



        Payable [] payment = new Payable[3];
        payment [0] = new Invoices(3,123,"wheels");
        payment [1] = new ContractEmployee("2342344","saif",4,340);
        payment [2] = new RegularEmplyee("345345","zohaib",34000);

        double totalPayment=0;
        for (Payable p:payment) {
            totalPayment+=p.getPayableAmount();
        }
        System.out.println("totalPayment = "+ totalPayment);
        // create the arraylist of the Payblae

        ArrayList<Payable>payables= new ArrayList<>();
        payables.add(invoices);
        payables.add(contractEmployee);
        payables.add(regularEmplyee);

        double tot=0;

        for (Payable p:payables) {
            tot+=p.getPayableAmount();
        }
        System.out.println("the total amount="+tot);
    }


}
