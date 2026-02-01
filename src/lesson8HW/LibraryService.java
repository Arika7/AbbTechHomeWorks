package lesson8HW;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryService {
    List<Book> books;
    List<User> users;

    public LibraryService(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public void sortBooks(){
        System.out.println("Sorted books: \n");
        Comparator<Book> comparator = Comparator.comparingDouble(Book::getRating).reversed().thenComparingInt(Book::getYear).thenComparing(Book::getTitle);
        books.sort(comparator);
        books.forEach(System.out::println);
    }

    public void analyzeLibrary(){
        System.out.println("\nLibrary analysis: \n");
        OptionalDouble avgRating = books.stream().mapToDouble(Book::getRating).average();
        if(avgRating.isPresent()) System.out.println("Average rating of books: " + avgRating.getAsDouble());
        else System.out.println("BookList is empty");

        List<Book> booksAvailableAfter2000 = books.stream().filter(b -> b.getYear()>2000 && b.isAvailable()).toList();

        System.out.println("Available books after 2000: " + booksAvailableAfter2000);

        Map<String, Long> borrowCount = users.stream().flatMap(u -> u.getBorrowHistory().stream()).collect(Collectors.groupingBy(b -> b.getBook().getTitle(), Collectors.counting()));

        Optional<Map.Entry<String,Long>> mostBorrowed = borrowCount.entrySet().stream().max(Map.Entry.comparingByValue());

        if(mostBorrowed.isPresent()) System.out.println("Most borrowed book is: " + mostBorrowed.get().getKey() +" "+ mostBorrowed.get().getValue() + " times");
        else System.out.println("None");

        Map<String, List<Book>> currentlyReading = users.stream()
                .collect(Collectors.toMap(User::getName, u -> u.getBorrowHistory().stream()
                                .filter(r -> r.getReturnedDate() == null)
                                .map(BorrowRecord::getBook)
                                .collect(Collectors.toList())
                ));
        System.out.println("Currently reading: ");
        currentlyReading.forEach((name, list) -> System.out.println(name +"-> " + list));

        Map<String, List<Book>> byAuthorAfter1950 = books.stream()
                .filter(b -> b.getYear() > 1950)
                .collect(Collectors.groupingBy(Book::getAuthor));
        System.out.println("Books grouped by author (after 1950):");
        byAuthorAfter1950.forEach((author, bk)-> System.out.println(author +"-> "+bk));
    }

    public Optional<Book> findRecommendedBookForUser(User user) {
        if (user.getBorrowHistory() == null || user.getBorrowHistory().isEmpty()) {
            return Optional.empty();
        }

        Map<String, Long> authorCounts = user.getBorrowHistory().stream()
                .collect(Collectors.groupingBy(r -> r.getBook().getAuthor(), Collectors.counting()));

        Optional<String> mostReadAuthor = authorCounts.entrySet().stream()
                .max(Map.Entry.<String, Long>comparingByValue()
                        .thenComparing(Map.Entry.comparingByKey())) // tie-break deterministic
                .map(Map.Entry::getKey);

        if (mostReadAuthor.isEmpty()) {
            return Optional.empty();
        }
        String author = mostReadAuthor.get();

        return books.stream()
                .filter(b -> author.equals(b.getAuthor()))
                .max(Comparator.comparingDouble(Book::getRating));


    }

    public Set<String> uniqueAuthorsRead() {
        Set<String> authors = users.stream()
                .flatMap(u -> u.getBorrowHistory().stream())
                .map(r -> r.getBook().getAuthor())
                .collect(Collectors.toSet());

        System.out.println("\nAuthors read by users: " + authors);
        return authors;
    }

    public Optional<User> findTopReaderOfMonth(List<User> usersList, int month, int year){
        return users.stream()
                .map(u -> new AbstractMap.SimpleEntry<>(
                        u,
                        Optional.ofNullable(u.getBorrowHistory()).orElse(Collections.emptyList()).stream()
                                .filter(r -> r.getBorrowedDate() != null
                                        && r.getBorrowedDate().getMonthValue() == month
                                        && r.getBorrowedDate().getYear() == year)
                                .count()
                ))
                .filter(e -> e.getValue() > 0)                 // ← проверка на 0
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);


    }
}
