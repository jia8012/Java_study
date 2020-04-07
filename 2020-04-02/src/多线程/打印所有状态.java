package 多线程;

public class 打印所有状态 {
	public static void main(String[] args) {
		Thread.State[] states = Thread.State.values();
		for (Thread.State state : states) {
			System.out.println(state);
		}
	}
}
