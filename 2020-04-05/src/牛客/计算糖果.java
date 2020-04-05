package 牛客;

import java.util.Scanner;

public class 计算糖果 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = scanner.nextInt();
		}
		if((arr[0] + arr[2])%2 == 1){
			System.out.println("No");
			return;
		}
		a = (arr[0] + arr[2]) / 2;
		b = (arr[1] + arr[3]) / 2;
		c = arr[2] + arr[3] - a - 2 * b;
		if ( a >= 0 && b >= 0 && c >= 0) {
			System.out.println(a + " " + b + " " + c);
		} else {
			System.out.println("No");
		}
	}
}