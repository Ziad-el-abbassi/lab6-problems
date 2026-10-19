package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;
    public Book(String title,String author, int nbr){
        super(title);
        this.author=author;
        this.nbrPages=nbr;
    }
    public String toString() {
        return "Book: author=" + author + ", nbrPages=" + nbrPages;
    }
    public String getAuthor(){
        return this.author;
    }
}
