package lesson8HW;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BorrowRecord {
    private Book book;
    private LocalDate borrowedDate;
    private LocalDate returnedDate;


    public BorrowRecord(Book book, LocalDate borrowedDate, LocalDate returnedDate) {
        this.book = book;
        this.borrowedDate = borrowedDate;
        this.returnedDate = returnedDate;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getBorrowedDate() {
        return borrowedDate;
    }

    public LocalDate getReturnedDate() {
        return returnedDate;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrowedDate(LocalDate borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setReturnedDate(LocalDate returnedDate) {
        this.returnedDate = returnedDate;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "book=" + book +
                ", borrowedDate=" + borrowedDate +
                ", returnedDate=" + returnedDate +
                '}';
    }
}
