package Problem2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> tr = new ArrayList<>();
        tr.add(500.0);
        tr.add(300.0);
        Bank bank = new Bank("BMCE", new ArrayList<Customer>());
        ArrayList<Double> tz= new ArrayList<>();
        tz.add(1000.0);
        Customer z = new Customer("Ziad", tz);
        Customer a=new Customer("Adam", tr);
        bank.addCustomer(z);
        bank.addCustomer(a);
        bank.addTransaction(505, z);
        bank.addTransaction(-453, z);
        bank.addTransaction(-2000, z);
        bank.print_statement(z);
        bank.print_statement(a);
    }
}
