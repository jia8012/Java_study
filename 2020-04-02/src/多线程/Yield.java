package 多线程;

public class Yield {

	private static class 其他线程 extends Thread{
		@Override
		public void run() {
			while (true) {
				System.out.println("其他线程");
				//Thread.yield();
			}
		}
	}
	public static void main(String[] args) {
		Thread t = new 其他线程();
		t.start();
		while (true) {
			System.out.println("你好");
			Thread.yield();
		}
	}
}
