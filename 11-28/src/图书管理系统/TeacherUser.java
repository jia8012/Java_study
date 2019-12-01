package 图书管理系统;

import java.util.Scanner;

public class TeacherUser extends User {
    @Override
    public void menu() { //菜单
        System.out.println("1. 上架图书");
        System.out.println("2. 下架图书");
        System.out.println("3. 现有图书");
    }

    @Override
    public void operation(int select) {  //菜单的选择
        switch (select) {
            case 1:
                addBook();  //上架
                break;
            case 2:
                removeBook();  //下架
                break;
            case 3:
                listBook();
                break;
        }
    }

    private void listBook() {
        BookShelf bookShelf = BookShelf.getInstance();
        Book[] books = bookShelf.getBook();
        System.out.println("书名，当前数量，总数");
        for (Book book : books) {
            System.out.println(
                      book.title + ","
                    + book.currentCount + ","
                    + book.totalCount);
        }
    }

    private void removeBook() {
        System.out.println("请输入书名");
        Scanner scanner = new Scanner(System.in);
        String downTitle = scanner.nextLine();
        BookShelf bookShelf = BookShelf.getInstance();
        if (bookShelf.biJiao(downTitle)) {
            bookShelf.remove(downTitle);
            System.out.println("下架成功");
        }else {
            System.out.println("系统出错了");
        }

    }

    private void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入书名");
        String title = scanner.nextLine();
        System.out.println("这次上架多少本");
        int count = scanner.nextInt();

        Book book = new Book();
        book.title = title;
        book.totalCount = count;
        book.currentCount = count;

        BookShelf bookShelf = BookShelf.getInstance();
        bookShelf.add(book);
        System.out.println("上架成功");
    }
}
