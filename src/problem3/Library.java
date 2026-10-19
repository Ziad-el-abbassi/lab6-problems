package problem3;
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;
    public Library(int capacity){
        this.capacity=capacity;
        this.documents = new ArrayList<Document>();
    }
    public void displayDocuments(){
        for (Document d : documents) {
            System.out.println(d);
        }
    }
    public boolean add(Document doc){
        if(documents.contains(doc) || documents.size()>capacity){
            return false;
        }
        documents.add(doc);
        return true;
    }
    public boolean delete(Document doc){
        if(documents.size()==0){
            return false;
        }
        documents.remove(doc);
        return true;
    }
    public Document document(int numEnrg){
        for(int i=0;i<documents.size();i++){
            if(documents.get(i).getNumRec()==numEnrg){
                return documents.get(i);
            }
        }
        return null;
    }
    public void displayAuthors(){
        for(Document d: documents){
            if(d instanceof Book){
                Book tmp = (Book) d;
                System.out.println(tmp.getAuthor());
            }
        }
    }

}
