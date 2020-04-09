package 牛客;

import java.util.Scanner;

public class Fibonacci数列{
	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (true) {
			if (num >= fib1 && num <= fib2) {
				break;
			}
			fib1 += fib2;
			fib1 ^= fib2;
			fib2 ^= fib1;
			fib1 ^= fib2;

		}
		System.out.println(num - fib1 < fib2 - num ? num - fib1 : fib2 - num);
	}
}
