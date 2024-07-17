import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    private List<Book> books;
    private List<Patron> patrons;

    public LibraryManagementSystem() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Patron added successfully: " + patron.getName());
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    public void displayPatrons() {
        System.out.println("Library Patrons:");
        for (Patron patron : patrons) {
            System.out.println("Name: " + patron.getName() + ", Address: " + patron.getAddress() + ", Contact: " + patron.getContactInfo());
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem librarySystem = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Example: Adding books and patrons
        Book book1 = new Book("Java Programming", "John Doe", "1234567890", 10);
        Book book2 = new Book("Python Basics", "Jane Smith", "0987654321", 5);
        librarySystem.addBook(book1);
        librarySystem.addBook(book2);

        Patron patron1 = new Patron("Alice Johnson", "123 Main St, City", "alice@email.com");
        Patron patron2 = new Patron("Bob Thompson", "456 Elm St, Town", "bob@gmail.com");
        librarySystem.addPatron(patron1);
        librarySystem.addPatron(patron2);

        // Example: Displaying books and patrons
        librarySystem.displayBooks();
        librarySystem.displayPatrons();

        scanner.close();
    }
}
