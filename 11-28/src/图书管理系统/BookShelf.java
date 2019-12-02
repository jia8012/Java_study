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

    public Book lookAndBack(String title) {
        int count;
        for (count = 0; count < size; count++) {
            if (array[count].title.equals(title)) {
                break;
            }
        }
        return array[count];

    }

    public void add(Book book) {
        array[size++] = book;
    }

    public void remove(String  title) {
        int count;
        for (count = 0; count < size; count++) {
            if (array[count].title.equals(title)) {
                break;
            }
        }

        for (int i = count; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public Book[] getBook() {
        return Arrays.copyOf(array,size);
    }

    public boolean biJiao(String title) {
        for (int i = 0; i < size; i++) {
            if (array[i].title.equals(title)) {
                return true;
            }
        }
        return false;
    }
}
