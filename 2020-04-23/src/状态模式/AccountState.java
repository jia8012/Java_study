package 状态模式;

//抽象状态类
public abstract class AccountState {
	double balance;
	Account acc;

	public abstract void stateCheck();

	public void deposit(double amount) {

		this.balance += amount;
		System.out.println("存款成功，当前账户余额："+this.balance);
		stateCheck();
	}

	public void withdraw(double amount) {

		this.balance -= amount;
		System.out.println("取款成功，当前账户余额："+this.balance);
		stateCheck();
	}
}
