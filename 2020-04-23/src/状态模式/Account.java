package 状态模式;

//它是个含有那些状态的对象，可以处理一些请求
//这些请求最终产生的响应会与状态相关
public class Account {
	AccountState state;
	String owner;

	public Account(String owner, double init) {
		this.owner = owner;
		System.out.println(owner + "开户成功,当前账户余额为：" + init);
		this.setState(new GreenState(init,this));
	}

	public void setState(AccountState state) {
		this.state = state;
	}

	public void deposit(double amount) {
		System.out.println(owner+" 存款："+amount);
		state.deposit(amount);
	}
	public void withdraw(double amount) {
		System.out.println(owner+" 取款："+amount);
		state.withdraw(amount);
	}
}
