package 图书管理系统;

import java.util.Scanner;

public class StudentUser extends User {
    @Override
    public void menu() {
        System.out.println("1. 借阅图书");
        System.out.println("2. 归还图书");
    }

    @Override
    public void operation(int select) {  //菜单的选择
        switch (select) {
            case 1:
                lookBook();  //借阅
                break;
            case 2:
                backBook();  //归还
                break;
            case 3:
                listBook();  //查看
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

    private void backBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String title = scanner.nextLine();
        BookShelf bookShelf = BookShelf.getInstance();
        bookShelf.lookAndBack(title).currentCount++;
        System.out.println("归还成功");
    }

    private void lookBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String title = scanner.nextLine();
        BookShelf bookShelf = BookShelf.getInstance();
        bookShelf.lookAndBack(title).currentCount--;
        System.out.println("借阅成功");
    }
}
