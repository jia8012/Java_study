package 牛客练习;

import java.util.Scanner;

public class 数字颠倒 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		String str = "";
		while(i > 0) {
			str +=i % 10;
			i /=10;
		}
		System.out.println(str);
	}
}
