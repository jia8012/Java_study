package 使用自定义的标志通知停止;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("主线程id：" + main.getId());

		Condition condition = new Condition();
		B b = new B(condition);
		// 定义变量并传入引用
		// 使得 B 线程看的条件和 main 中修改的条件是同一个对象
		// B 线程才能看到我的修改

		b.start();

		Scanner sc = new Scanner(System.in);
		System.out.println("随便输入什么，都会让子线程停止挖煤");
		sc.nextLine();
		condition.running = false;

	}
}
