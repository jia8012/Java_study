package 牛客;

import java.util.Scanner;

public class 尼科彻斯定理 {
	public static String getSequeOddNum(int m) {
		String str = "";
		int num = m * m - m + 1;
		for (int i = 0; i < m - 1; i++) {
			str += num;
			str += "+";
			num += 2;
		}
		return str += num;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int m = scanner.nextInt();
			System.out.println(getSequeOddNum(m));
		}
	}
}

