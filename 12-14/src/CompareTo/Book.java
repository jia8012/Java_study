package CompareTo;

import java.util.Comparator;
import java.util.Scanner;

public class Book implements Comparable<Book>{
	String ISBN;
	String title;
	String author;
	int price;

	//重写equals
	@Override
	public boolean equals (Object obj) {
		//1. obj == null   不相等
		if (obj == null) {
			return false;
		}
		//2. obj 不是Book   不相等
		if (!(obj instanceof Book)) {
			return false;
		}
		//3. 向下转型
		Book book = (Book)obj;
		//4. 根据需要进行比较
		return book.ISBN.equals(((Book) obj).ISBN);
	}

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.ISBN = "119";
		book1.title = "123";
		book1.author = "456";
		book1.price = 789;

		Book book2 = new Book();
		book2.ISBN = "119";
		book2.title = "123";
		book2.author = "789";
		book2.price = 789;

		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		if (line.equalsIgnoreCase("价格")) {
			//按照价格比较
			int r = book1.compareTo(book2);
			System.out.println(r);
		}
		if (line.equalsIgnoreCase("书名")) {
			Comparator<Book> c = new BookComparator();
			int r = c.compare(book1, book2);
			System.out.println(r);
		}
		if (line.equalsIgnoreCase("作者")) {
			Comparator<Book> c = new AuthorComparator();
			int r = c.compare(book1, book2);
			System.out.println(r);
		}


	}

	@Override
	public int compareTo(Book o) {
		return this.price - o.price;
	}
}
