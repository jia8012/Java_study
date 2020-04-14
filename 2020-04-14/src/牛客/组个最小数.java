package 牛客;

import java.util.Arrays;
import java.util.Scanner;

public class 组个最小数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] arr = str.split(" ");
		int[] num = new int[arr.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(String.valueOf(arr[i]));
		}
		Arrays.sort(num);
		int length = num.length;
		String result = "";
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 1) result += num[i];
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0) result += num[i];
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 1 && num[i] != 0) result += num[i];
		}
		System.out.println(result);
	}
}
