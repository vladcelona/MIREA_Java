package practice_files.second;

import java.util.Arrays;
import java.util.Comparator;

class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Геттер для автора книги
    public String getAuthor() {
        return author;
    }

    // Сеттер для автора книги
    public void setAuthor(String author) {
        this.author = author;
    }

    // Геттер для названия книги
    public String getTitle() {
        return title;
    }

    // Сеттер для названия книги
    public void setTitle(String title) {
        this.title = title;
    }

    // Геттер для года выпуска книги
    public int getYear() {
        return year;
    }

    // Сеттер для года выпуска книги
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", year=" + year + "]";
    }
}

class BookShelf {
    private Book[] books;
    private int numberOfBooks;

    public BookShelf(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    // Метод для добавления книги на книжную полку
    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Книжная полка переполнена. Невозможно добавить больше книг.");
        }
    }

    // Метод для получения книги с самым поздним годом издания
    public Book getLatestBook() {
        if (numberOfBooks == 0) {
            return null;
        }

        Book latestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }

        return latestBook;
    }

    // Метод для получения книги с самым ранним годом издания
    public Book getEarliestBook() {
        if (numberOfBooks == 0) {
            return null;
        }

        Book earliestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }

        return earliestBook;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    // Метод для сортировки книг на книжной полке по году выпуска (в порядке возрастания)
    public void sortBooksByYear() {
        Arrays.sort(books, 0, numberOfBooks, Comparator.comparingInt(Book::getYear));
    }
}

public class BookTask {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5); // Создаем книжную полку с максимальной вместимостью 5 книг

        // Добавляем книги на книжную полку
        bookShelf.addBook(new Book("Автор1", "Книга1", 2000));
        bookShelf.addBook(new Book("Автор2", "Книга2", 1995));
        bookShelf.addBook(new Book("Автор3", "Книга3", 2010));
        bookShelf.addBook(new Book("Автор4", "Книга4", 1980));
        bookShelf.addBook(new Book("Автор5", "Книга5", 2015));

        // Выводим книги с самым поздним и самым ранним годом издания
        System.out.println("Книга с самым поздним годом издания: " + bookShelf.getLatestBook());
        System.out.println("Книга с самым ранним годом издания: " + bookShelf.getEarliestBook());

        // Сортируем книги на книжной полке по году выпуска и выводим
        bookShelf.sortBooksByYear();
        System.out.println("Книги на книжной полке (отсортированы по году выпуска):");
        for (int i = 0; i < bookShelf.getNumberOfBooks(); i++) {
            System.out.println(bookShelf.getBooks()[i]);
        }
    }
}
