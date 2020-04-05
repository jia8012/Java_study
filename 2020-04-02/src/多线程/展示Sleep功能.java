package 多线程;

import java.util.concurrent.TimeUnit;

public class 展示Sleep功能 {
	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		System.out.println(start);

		//Thread.sleep(5000);
		TimeUnit.SECONDS.sleep(1);  // 秒
		long end = System.currentTimeMillis();
		System.out.println(end);

		System.out.println(end - start);



	}
}
