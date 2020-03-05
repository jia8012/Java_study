import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int result = a + b;
//		System.out.println(a + b +"是两个数的和" + (a + b));
//		System.out.println(a + b +"是两个数的和" + a + b);
//		System.out.println("两个数的和是：" + a + b);
//		System.out.println("两个数的和是：" + (a + b));
//		System.out.println("两个数的和是：" + result);

		Scanner scanner = methodReturn();
		int i = scanner.nextInt();
		System.out.println(i);

		methodParam(new Scanner(System.in));
	}

	public static void methodParam(Scanner sc) {
		int i = sc.nextInt();
		System.out.println("输入的数字是" + i);
	}

	public static Scanner methodReturn(){
		return new Scanner(System.in);
	}
}
