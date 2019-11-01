import java.util.Random;
import java.util.Scanner;

public class GuessGame{
	public static void main(String[] args){
		// Random random = new Random();
		// for ( int i = 0; i< 20; i++){
			// int r = random.nextInt(10);
			// System.out.println(r);
		// }
		
		Random random = new Random(1);   //随机
		Scanner scanner = new Scanner(System.in);
		int n = random.nextInt(100);   //生成小于100的随机数
		System.out.println("数字已生成");
		int times = 4;
		System.out.println("你一共有" + times + "次机会");
		for(int i = 1; i <= times; i++){
			System.out.println(">");
			int x = scanner.nextInt();
			if(x == n){
				System.out.println("猜成功了，用了" + i + "次机会");
				return;
			}else if(x < n){
				System.out.println("第" + i + "次猜测，您猜的数字猜小了");
			}else{
				System.out.println("第" + i + "次猜测，您猜的数字猜大了");
			}
		}
		System.out.println("很遗憾，Game Over");
		System.out.println("数字其实是" + n);
		
	}
}