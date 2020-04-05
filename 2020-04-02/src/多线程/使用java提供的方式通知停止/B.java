package 多线程.使用java提供的方式通知停止;

public class B extends Thread{
	@Override
	public void run() {
		// B 线程中判断是否有人让自己停止
		while (Thread.interrupted() == false) {
			System.out.println("挖煤");
		}
	}
}
