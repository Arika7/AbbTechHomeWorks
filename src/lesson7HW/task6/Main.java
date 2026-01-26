package lesson7HW.task6;

public class Main {
    public static void main(String[] args) {
        Library<Library.Section> library = new Library<>();

        // Создаём секции
        Library.Section fiction = new Library.Section("Fiction");
        Library.Section science = new Library.Section("Science");

        // Создаём книги (inner class)
        Library<Library.Section>.Book b1 =
                library.new Book("The Martian", "Andy Weir", 2011);

        Library<Library.Section>.Book b2 =
                library.new Book("Project Hail Mary", "Andy Weir", 2021);

        Library<Library.Section>.Book b3 =
                library.new Book("A Brief History of Time", "Stephen Hawking", 1988);

        // Добавляем книги в секции
        fiction.addBook(b1);
        fiction.addBook(b2);
        science.addBook(b3);

        // Добавляем секции в библиотеку
        library.addSection(fiction);
        library.addSection(science);

        // Показываем все секции
        library.displayAllSections();

    }
    }

