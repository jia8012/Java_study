package 牛客;

import java.util.Scanner;

public class 跟奥巴马一起编程 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		char c = scanner.next().charAt(0);
		int n = (N + 1) / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < N; j++) {
				if (i == 0 || j == 0 || i == (n - 1) || j == N - 1) {
					System.out.print(c);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}