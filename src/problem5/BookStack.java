package problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> stack;

    public BookStack() {

    }

    public void push(Book book) {
        stack.addFirst(book);
    }

    public Book pop() {
        Book tmp=stack.removeFirst();
        return tmp;
        // code here and don't to test if it's empty
    }

    public Book peek() {
        return stack.getFirst();
        // code here and don't to test if it's empty
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.get(i));
        }
    }
}

