package 牛客;

import java.util.Scanner;

public class 数字之和 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num = scanner.nextInt();
			String str1 = "" + num;
			int nums = (int) Math.pow(num, 2);
			String str2 = "" + nums;
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			num = 0;
			nums = 0;
			for (int i = 0; i < arr1.length; i++) {
				num += Integer.parseInt(String.valueOf(arr1[i]));
			}
			for (int i = 0; i < arr2.length; i++) {
				nums += Integer.parseInt(String.valueOf(arr2[i]));
			}
			System.out.println(num + " " + nums);
		}
	}
}
