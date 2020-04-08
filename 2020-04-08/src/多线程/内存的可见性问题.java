package 多线程;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class 内存的可见性问题 {
	private static boolean running = true;

	private static class 子线程 extends Thread {
		@Override
		public void run () {
			int n = 0;
			while(running) {
				n++;
			}
			System.out.println(n);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread t = new 子线程();
		t.start();

		Scanner scanner = new Scanner(System.in);
		System.out.print("随便输入什么，让子线程退出：");
		scanner.nextLine();

		System.out.println(running);
		running = false;
		System.out.println(running);


		while (true) {
			System.out.println(t.getState());
			TimeUnit.SECONDS.sleep(1);
		}
	}
}
