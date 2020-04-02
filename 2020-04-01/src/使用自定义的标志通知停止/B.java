package 使用自定义的标志通知停止;

public class B extends Thread {
	private Condition condition;

	B(Condition condition) {
		this.condition = condition;
	}

	@Override
	public void run() {
		Thread thread = currentThread();
		while (condition.running) {
			System.out.println(thread.getId() + ":挖煤");
		}
	}
}
