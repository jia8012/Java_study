package 多线程.使用java提供的方式通知停止;

import java.util.concurrent.TimeUnit;

public class B extends Thread{
	@Override
	public void run() {
		// B 线程中判断是否有人让自己停止
		while (Thread.interrupted() == false) {
			try {
				System.out.println("挖煤");
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				//我收到让我停止的通知了，但我就不停
				System.out.println(e);
				//如果 B 要停止，就是退出循环，怎么退出？
				break;
			}
		}
	}
}
