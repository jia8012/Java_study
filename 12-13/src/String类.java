public class String类 {
	public static void main(String[] args) {

		StringBuffer a1 = new StringBuffer();   //创建一个对象，无初始值
		StringBuffer a2 = new StringBuffer("abc");   //创建一个对象，初始值为“abc”
		StringBuffer a3 = new StringBuffer(32);   //创建一个对象，初始容量为32个字符；

		a1.append(1);
		a1.append(2);
		System.out.println(a1);

		System.out.println(a2);

		System.out.println(a3);
	}
}
