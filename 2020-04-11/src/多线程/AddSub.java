package 多线程;

public class AddSub {
	private static long n = 0;
	private static final long COUNT = 1_0000_0000L;
	private static Object lock = new Object();
	private static class Add extends Thread {
		@Override
		public void run() {

			for (long i = 0; i < COUNT; i++) {
				synchronized (lock) {
					n++;
				}
			}
		}
	}

	private static class Sub extends Thread {
		@Override
		public void run() {
			for (long i = 0; i < COUNT; i++) {
				synchronized (lock) {
					n--;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Add add = new Add();
		Sub sub = new Sub();
		add.start();
		sub.start();

		add.join();
		sub.join();
		System.out.println(n);
	}
}

