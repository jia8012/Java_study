package 图书管理系统;

import java.util.Arrays;

public class BookShelf {
    private static final BookShelf instance = new BookShelf();
    private BookShelf() {}

    public static BookShelf getInstance() {
        return instance;
    }

    Book[] array = new Book[100];
    int size;

    public void add(Book book) {
        array[size++] = book;
    }

    public Book[] getBook() {
        return Arrays.copyOf(array,size);
    }
}
