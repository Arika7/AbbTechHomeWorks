package lesson6HW.main;

import lesson6HW.models.Book;
import lesson6HW.models.SimpleLibrary;

public class Lesson6LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book(
                "B1984",
                "George Orwell",
                "Dystopian",
                1949
        );

        Book book2 = new Book(
                "To Kill a Mockingbird",
                "Harper Lee",
                "Classic",
                1960
        );

        Book book3 = new Book(
                "The Lord of the Rings",
                "J.R.R. Tolkien",
                "Fantasy",
                1954
        );

        Book book4 = new Book(
                "The Catcher in the Rye",
                "AJ.D. Salinger",
                "Classic",
                1951
        );

        Book book5 = new Book(
                "Alean Code",
                "Robert C. Martin",
                "Programming",
                2008
        );

        SimpleLibrary simpleLibrary = new SimpleLibrary();
        simpleLibrary.addBook(book1);
        simpleLibrary.addBook(book2);
        simpleLibrary.addBook(book3);
        simpleLibrary.addBook(book4);
        simpleLibrary.addBook(book5);
        simpleLibrary.removeBook(book1);
        System.out.println("-------");
        System.out.println("------------------");
        simpleLibrary.searchBookByTitle("Clean Code");
        System.out.println("------------------");
        simpleLibrary.searchBookByAuthor("Robert C. Martin");
        System.out.println("------------------");
        simpleLibrary.searchBookByGenre("Programming");
        System.out.println("------------------");


        simpleLibrary.displayAllBooks();
        System.out.println("------------------");
        System.out.println("List sorted by default: ");
        simpleLibrary.displaySortedByDefault();
        System.out.println("------------------");
        System.out.println("List sorted by Author: ");
        simpleLibrary.displaySortedByAuthor();
        System.out.println("------------------");
        System.out.println("List sorted by Year: ");
        simpleLibrary.displaySortedByYear();
        System.out.println("------------------");

        simpleLibrary.totalNumberOfBooks();



    }


}
