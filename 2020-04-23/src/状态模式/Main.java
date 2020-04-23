package 状态模式;

//测试代码
public class Main {
	public static void main(String[] args) {
		Account account = new Account("贾海军",100);
		System.out.println("==================================");
		account.deposit(200);
		System.out.println("==================================");
		account.withdraw(150);
		System.out.println("==================================");
		account.deposit(300);
		System.out.println("==================================");
		account.withdraw(2000);
		System.out.println("==================================");
		account.withdraw(100);
	}
}
