package 牛客;


import java.util.Scanner;

public class 饥饿的小易 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x_0 = in.nextInt();
		int count = 0;
		while (x_0 != 0 && count <= 300000) {
			x_0 = ((x_0 << 1) + 1) % 1000000007;
			count++;
		}
		int res = (count + 2) / 3;
		System.out.println(res > 100000 ? -1 : res);
	}
}
