package 牛客;

import java.util.Scanner;

public class 最小公倍数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (a > b) {
			int num = a;
			while ((num % a != 0) || (num % b != 0)) {
				num++;
			}
			System.out.println(num);
		}
		if (a <= b) {
			int num = b;
			while ((num % a != 0) || (num % b != 0)) {
				num++;
			}
			System.out.println(num);
		}
	}
}
