import java.util.Random;

public class DemoRandom {
	public static void main(String[] args){
		Random r = new Random();
		for (int i = 0; i < 10; i++) {		//打印[0,9)
//			Thread.sleep(r.nextInt(2000));
			System.out.print(r.nextInt(10) + "\t");
		}
		System.out.println();
		System.out.println("---------------------------");
		for (int i = 0; i < 10; i++) {		//打印[1,10]
			System.out.print(r.nextInt(10) + 1 + "\t");
		}
	}
}
