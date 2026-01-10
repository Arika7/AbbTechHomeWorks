package lesson4HW;

public class Book {


    {
        System.out.println("New book created!");
    }

    private String title;
    private String author;
    private String isbn;
    protected int totalCopies;
    protected int availableCopies;


    public Book() {
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalCopies = 1;
        availableCopies = 1;
    }

    public void borrowBook() {
        if(availableCopies >=1) {
            System.out.println("Book borrowed successfully");
            availableCopies--;
        }
        else System.out.println("Sorry, no books available");
    }

    public void returnBook(){
        if(availableCopies<totalCopies){
            availableCopies++;
            System.out.println("Book returned successfully");
        }else System.out.println("All books are already in the library");
    }

    public void printInfo(){
        System.out.println(this.toString());
    }

    public static void libraryRules(){
        System.out.println("Max 3 books can be borrowed per person.");
    }
    public final void bookType(){
        System.out.println("This is a regular book.");
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", totalCopies=" + totalCopies +
                ", availableCopies=" + availableCopies +
                '}';
    }
}
