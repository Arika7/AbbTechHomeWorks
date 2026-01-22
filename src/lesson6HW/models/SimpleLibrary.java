package lesson6HW.models;

import lesson6HW.util.AuthorComparator;
import lesson6HW.util.YearComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SimpleLibrary {
    private final List<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
        System.out.println("You have added a book named: "+ book.getTitle());
    }

    public void removeBook(Book book){
        if(bookList.remove(book)) System.out.println("You have removed a book named: "+ book.getTitle());
        else System.out.println("There is no book name: " + book.getTitle());

    }

    public void searchBookByTitle(String title){
        Optional<Book> book = Optional.empty();
        for (Book b :bookList){
            if(b.getTitle().equals(title)) book = Optional.of(b);
        }
        book.ifPresent(System.out::println);

    }
    public void searchBookByAuthor(String author){
        Optional<Book> book = Optional.empty();
        for (Book b :bookList){
            if(b.getAuthor().equals(author)) book = Optional.of(b);
        }
        book.ifPresent(System.out::println);

    }
    public void searchBookByGenre(String genre){
        Optional<Book> book = Optional.empty();
        for (Book b :bookList){
            if(b.getGenre().equals(genre)) book = Optional.of(b);
        }
        book.ifPresent(System.out::println);

    }

    public void displayAllBooks(){
        System.out.println("All books in the library:");
        for (Book b : bookList){
            System.out.println(b.getTitle()+" book by "+ b.getAuthor() + " published at: " + b.getPublicationYear());
        }
    }

    public void totalNumberOfBooks(){
        System.out.println(bookList.size());
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void displaySortedByDefault() {
        Collections.sort(this.getBookList());
        displayAllBooks();
    }

    public void displaySortedByAuthor() {
        this.getBookList().sort(new AuthorComparator());
        displayAllBooks();
    }

    public void displaySortedByYear(){
        this.getBookList().sort(new YearComparator());
        displayAllBooks();
    }
}
