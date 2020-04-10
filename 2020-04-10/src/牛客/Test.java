package 牛客;

public class Test {
	public void add(Byte b) {
		b = b++;
	}

	public void test() {
		Byte a = 127;
		Byte b = 127;
		add(++a);
		System.out.print(a + " ");
		add(b);
		System.out.print(b + "");
	}
	public static void main(String[] args) {
		new Test().test();

		String str1 = "hello";
		String str2 = "he" + new String("llo");
		System.err.println(str1 == str2);
	}
}
