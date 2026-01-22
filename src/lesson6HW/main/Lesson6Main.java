package lesson6HW.main;

import lesson6HW.models.Book;

public class Lesson6Main {
    public static void main(String[] args) {
        Book book1 = new Book(
                "1984",
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

        Book book3 = book2;

        Book book4 = new Book(
                "The Catcher in the Rye",
                "J.D. Salinger",
                "Classic",
                1951
        );

        Book book5 = new Book(
                "The Catcher in the Rye",
                "J.D. Salinger",
                "Classic",
                1951
        );

        Book book = null;
        System.out.println(book);


        System.out.println(book4.equals(book5));
        System.out.println(book4== book5);
        System.out.println(book3 == book2);
        System.out.println(book3.equals(book2));
    }
}
