package 牛客;

import java.util.Scanner;

public class 出现次数大于数组长度一半的数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] s = str.split(" ");
		Integer[] arr = new Integer[s.length];
		for (int i = 0; i < s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int len = arr.length / 2;
		int[] a = new int[100];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (arr[i] == j) {
					a[j]++;
				}
			}
		}
		int ret = 0;
		for (int j = 0; j < a.length; j++) {
			if (len <= a[j]) {
				ret = j;
			}
		}
		System.out.println(ret);
	}
}
