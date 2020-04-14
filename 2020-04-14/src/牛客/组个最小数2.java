package 牛客;

import java.util.Scanner;

public class 组个最小数2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] arr = str.split(" ");
		int[] num = new int[arr.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(String.valueOf(arr[i]));
		}
		String result = "";
		if(num[1] > 0) {
			result += 1;
		}
		if (num[0] > 0) {
			for (int i = 0; i < num[0]; i++) {
				result += 0;
			}
		}
		if (num[1] > 1) {
			for (int i = 1; i < num[1]; i++) {
				result += 1;
			}
		}
		for (int i = 2; i <= 9; i++) {
			for (int i1 = 0; i1 < num[i]; i1++) {
				result += i;
			}
		}
		System.out.println(result);
	}
}
