package 多线程;

public class synchronized的语法演示 {
	//作为方法修饰符
	public synchronized static void staticMethod() {
		/*synchronized (synchronized的语法演示.class) {

		}*/
	}
	public synchronized void method() {
		/*synchronized (this) {

		}*/
	}

	//作为代码块  ————  同步代码
	public void someMethod() {
		Object o = new Object();
		synchronized (o) {

		}
	}
}
