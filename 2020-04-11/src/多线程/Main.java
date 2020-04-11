package 多线程;

import java.util.Scanner;

public class Main {
	private volatile static boolean running = true;

	private static class SubThread extends Thread {
		@Override
		public void run() {
			int n = 0;
			while (running) {
				n++;
			}
			System.out.println(n);
			System.out.println("应该退出了");
		}
	}

	public static void main(String[] args) {
		SubThread subThread = new SubThread();
		subThread.start();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		running = false;
	}
}
