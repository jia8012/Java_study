public class 线程的优势_提升速度 {
	private static final long COUNT = 10_0000_0000L;
	private static final int N = 10;

	private static void calc() {
		long r = 0;
		for (long i = 0; i < COUNT; i++) {
			r += i;
		}
		System.out.println(r);
	}


	private static class CalcThred extends Thread{
		@Override
		public void run() {
			//一个线程只需要计算一遍 calc
			calc();
		}
	}

	//主线程一个线程在计算
	public static void main(String[] args) throws InterruptedException {
		long start = System.nanoTime();

		CalcThred[] threads = new CalcThred[N - 1];
		//N个线程同时执行，其实主线程不需要创建，所以我们是需要创建N - 1个线程
		for (int i = 0; i < N - 1; i++) {
			//创建了N - 1个线程，每个线程都执行一次
			CalcThred thread = new CalcThred();
			thread.start();
			threads[i] = thread;
		}

		calc();  //剩余的一次，放到主线程中来计算

		//什么时候记录结束时间
		//代码走到这里时，只代表主线程中的calc计算完成了。
		//但是另外的N - 1个线程是否计算完成，是不知道的
		//所以，我需要等待另外N - 1个线程全部完成，才结束计时
		for (int i = 0; i < N - 1; i++) {
			threads[i].join();  //阻塞在这个方法上，直到 threads[i] 线程执行结束
		}

		//这时代表所有的线程都执行结束了
		long end = System.nanoTime();
		System.out.println("耗时：" + (end - start) * 1.0 / 1000 / 1000 + "ms");


		//一味的提升线程并不能提升速度
		//1.抢到的 CPU 是有极限的   --100%都分配
		//2.耗费掉的创建/销毁时间成本就越来越高
		//3.OS负担变大，也会降低速度


//		long start = System.nanoTime();
//		for (int i = 0; i < N; i++) {
//			calc();
//		}
//		long end = System.nanoTime();
//
//		System.out.println("耗时：" + (end - start) * 1.0 / 1000 / 1000 + "ms");
	}
}
