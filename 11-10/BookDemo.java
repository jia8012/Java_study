public class BookDemo{
	public static void main(String[] args){
		// Book b = new Book();
		// System.out.println(b.getName());
		// System.out.println(b.getWriter());
		// System.out.println(b.getPrice());
		// System.out.println(b.getPress());
		
		// b.addWriter("Jerry");
		// b.discount(8);
		// System.out.println(b.getName());
		// System.out.println(b.getWriter());
		// System.out.println(b.getPrice());
		// System.out.println(b.getPress()); 
		Book book = new Book("钢铁是怎样炼成的","奥斯特洛夫斯基",
							98.0,	"商务出版社"
		);
		Book book2 = new Book("三体  I","刘慈欣",
							50,"北京工业出版社"
							);
		System.out.println(book/*book.toString*/);
		System.out.println(book.discount(8));
		
		System.out.println(book2/*book.toString*/);
		System.out.println(book2.discount(20));
	}
}