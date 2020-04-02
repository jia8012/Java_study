package 牛客练习;

import java.util.Scanner;

public class 牛客_买苹果 {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int apple = sc.nextInt();
			// 8 -
			// 6 +
			//所有循环完不满足则为 -1;
			for (int  i = apple/8; i >= 0; i--) {
				for (int j = 0; j <= apple/6; j++) {
					if (i*8 + j*6 == apple) {
						System.out.println(i + j);
						return;
					}
				}
			}
			System.out.println(-1);
		}
	}
}
