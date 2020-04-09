package 牛客;

import java.util.Scanner;

public class 个位数统计 {
	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int a = Integer.parseInt(str);
		int[] arr = new int[10];
		if(a == 0) {
			System.out.println(0+":"+1);
		}
		while (a > 0) {
			arr[a%10]++;
			a /= 10;
		}
		for (int i = 0; i < 10; i++) {
			if (arr[i] > 0) {
				System.out.println(i + ":" + arr[i]);
			}
		}
	}*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] arr = str.toCharArray();
		int[] array = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			array[i] = Integer.parseInt(String.valueOf(arr[i]));
		}

		int[] nums = new int[10];
		for (int i = 0; i < array.length; i++) {
			nums[array[i]]++;
		}

		for (int i = 0; i < 10; i++) {
			if (nums[i] > 0) {
				System.out.println(i + ":" + nums[i]);
			}
		}
	}
}
