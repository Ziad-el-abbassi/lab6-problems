package problem3;

public class Document {
    protected int numRec;
    protected String title;
    private static int numEnreg=0;
    public Document(String title){
        this.numRec=numEnreg++;
        this.title=title;
    }
    public String toString() {
        return "Document: numRec=" + numRec + ", title=" + title;
    }
    public int getNumRec(){
        return this.numRec;
    }
}
