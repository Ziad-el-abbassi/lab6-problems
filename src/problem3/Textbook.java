package problem3;

public class Textbook extends Book{
    public String level;
    public Textbook(String title,String author,int nbr,String level){
        super(title,author,nbr);
        this.level=level;
    }
    public String toString() {
        return "Textbook: level=" + level;
    }
}
