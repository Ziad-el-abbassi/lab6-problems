package problem3;

public class Dictionary extends Document{
    private String language;
    public Dictionary(String title,String l){
        super(title);
        this.language=l;
    }
    public String toString() {
        return "Dictionary: language=" + language;
    }
}
