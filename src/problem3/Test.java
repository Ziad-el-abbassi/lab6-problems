package problem3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the library capacity: ");
        int n = sc.nextInt();
        sc.nextLine();
        Library lib = new Library(n);
        lib.add(new Book("Les Misérables", "Victor Hugo", 344));
        lib.add(new Dictionary("Dictionary", "English"));
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n");
            System.out.println("1. Add  2. Display  3. Delete  4. Authors  0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice==1){
                System.out.print("Title: ");
                String title = sc.nextLine();
                System.out.print("Author: ");
                String author = sc.nextLine();
                System.out.print("Pages: ");
                int pages = sc.nextInt();
                sc.nextLine();
                System.out.println(lib.add(new Book(title, author, pages)) ? "Added" : "Library full");
            }
            else if (choice==2){
                lib.displayDocuments();
            }
            else if (choice==3){
                System.out.print("Record number: ");
                Document d = lib.document(sc.nextInt());
                sc.nextLine();
                System.out.println(lib.delete(d)?"Deleted":"Not found");
            }
            else if (choice == 4) {
                lib.displayAuthors();
            }
        }
    }
}
