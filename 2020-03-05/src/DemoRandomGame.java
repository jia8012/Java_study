import java.util.Random;
import java.util.Scanner;

public class DemoRandomGame {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("请输入你猜的数字：");
			int guessNum = sc.nextInt();
			if (num > guessNum) {
				System.out.println("猜小了");
			} else if (num < guessNum) {
				System.out.println("猜大了");
			} else{
				System.out.println("猜中了");
				break;
			}
		}

		System.out.println("游戏结束.");
	}
}
