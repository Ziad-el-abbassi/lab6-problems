package problem3;

public class Novel extends Book {
    public double price;
    public Novel(String title, String author, int nbr,double price){
        super(title,author,nbr);
        this.price=price;
    }
    public String toString() {
        return "Novel: price=" + price;
    }
}
