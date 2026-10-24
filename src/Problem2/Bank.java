package Problem2;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name,ArrayList<Customer> c){
        this.name=name;
        this.customers=c;
    }
    public void addCustomer(Customer c){
        if(!customers.contains(c)){
            customers.add(c);
        }
    }
    public void addTransaction(double transaction,Customer c){
        int i=customers.indexOf(c);
        customers.get(i).getTransaction().add(transaction);
    }
    public void print_statement(Customer c){
        System.out.println(c.getName());
        for (int i=0;i<c.getTransaction().size();i++){
            double tmp=c.getTransaction().get(i);
            System.out.print(tmp+" ");
        }
    }
}
