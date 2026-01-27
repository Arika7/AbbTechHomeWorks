package lesson7HW.task6;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Library.Section> {

    private List<T> sections = new ArrayList<>();
    void addSection(T section){
        sections.add(section);
    }
    void displayAllSections(){
        sections.forEach(System.out::println);
    }

    void filterBooks(BookFilter bookFilter){
        sections.stream().flatMap(section -> section.getBooks().stream()).filter(bookFilter::filter).forEach(System.out::println);
    }

    static class Section{
        private String name;
        private final List<Library<?>.Book> books = new ArrayList<>();

        public Section(String name) {
            this.name = name;
        }

        public void addBook(Library<?>.Book book){
            getBooks().add(book);
        }

        public void displayBooks(){
            getBooks().forEach(System.out::println);
        }

        public List<Library<?>.Book> getBooks() {
            return books;
        }

        @Override
        public String toString() {
            return "Section{" +
                    "name='" + name + '\'' +
                    ", books=" + books +
                    '}';
        }
    }

    class Book{
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    '}';
        }
    }
}
