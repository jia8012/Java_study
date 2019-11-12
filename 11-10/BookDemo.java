public class BookDemo{
	public static void main(String[] args){
		Book b = new Book();
		System.out.println(b.getName());
		System.out.println(b.getWriter());
		System.out.println(b.getPrice());
		System.out.println(b.getPress());
		
		b.addWriter("Jerry");
		b.discount(8);
		System.out.println(b.getName());
		System.out.println(b.getWriter());
		System.out.println(b.getPrice());
		System.out.println(b.getPress());
	}
}