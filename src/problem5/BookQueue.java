package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {

    }

    public void enqueue(Book book) {
        queue.addLast(book);
    }

    public Book dequeue() {
        Book tmp=queue.removeFirst();
        return tmp;
        // code here and don't to test if it's empty
    }

    public Book peek() {
        return queue.getFirst();
        // code here and don't to test if it's empty
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Queue contents (front to back):");
        for(int i=0;i<queue.size();i++){
            System.out.println(queue.get(i));
        }
    }
}
