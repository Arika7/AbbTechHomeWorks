package lesson8HW;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LibraryMain {
    public static void main(String[] args) {

        Book b1 = new Book("1984", "George Orwell", 1949, 4.9, true);
        Book b2 = new Book("Animal Farm", "George Orwell", 1945, 4.8, false);
        Book b3 = new Book("Clean Code", "Robert Martin", 2008, 4.7, true);
        Book b4 = new Book("Effective Java", "Joshua Bloch", 2018, 4.9, true);
        Book b5 = new Book("The Pragmatic Programmer", "Andy Hunt", 1999, 4.6, true);
        Book b6 = new Book("Java Concurrency in Practice", "Brian Goetz", 2006, 4.5, false);

        List<Book> books = Arrays.asList(b1, b2, b3, b4, b5, b6);

        // --- Users ---
        User u1 = new User("Aydin", 25, Arrays.asList(
                new BorrowRecord(b1, LocalDate.of(2025, 9, 1), LocalDate.of(2025, 9, 10)),
                new BorrowRecord(b3, LocalDate.of(2025, 10, 5), null)
        ));
        User u2 = new User("Leyla", 22, Arrays.asList(
                new BorrowRecord(b4, LocalDate.of(2025, 10, 2), LocalDate.of(2025, 10, 20)),
                new BorrowRecord(b6, LocalDate.of(2025, 10, 12), null)
        ));
        User u3 = new User("Murad", 28, Arrays.asList(
                new BorrowRecord(b5, LocalDate.of(2025, 9, 10), LocalDate.of(2025, 9, 25))
        ));

        List<User> users = Arrays.asList(u1, u2, u3);

        LibraryService service = new LibraryService(books, users);

        service.sortBooks();
        service.analyzeLibrary();
        service.uniqueAuthorsRead();

        System.out.println("\nRecommendation for Aydin:");
        // Java 9+: ifPresentOrElse(...) exists. For Java 8, emulate with isPresent check:
        Optional<Book> rec = service.findRecommendedBookForUser(u1);
        if (rec.isPresent()) {
            System.out.println("Recommended: " + rec.get());
        } else {
            System.out.println("No recommendation available.");
        }

        System.out.println("\nTop Reader of October 2025:");
        service.findTopReaderOfMonth(users,10, 2025)
                .ifPresent(u -> System.out.println("Top Reader: " + u.getName()));
    }
}
