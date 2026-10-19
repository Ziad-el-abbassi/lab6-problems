package Problem2;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name,ArrayList<Double> t){
        this.name=name;
        this.transactions=t;
    }
    public ArrayList<Double> getTransaction(){
        return this.transactions;
    }
    public String getName(){
        return this.name;
    }

}
