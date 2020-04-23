package 状态模式;

//具体的状态类，红色状态
public class RedState extends AccountState{
	public RedState(AccountState state) {
		System.out.println("当前账户状态：Red");
		this.acc = state.acc;
		this.balance = state.balance;
	}

	@Override
	public void stateCheck() {

		if (this.balance > 0) {
			acc.setState(new GreenState(this));
		} else if (this.balance < 0 && this.balance > -1000) {
			acc.setState(new GreenState(this));
		} else System.out.println("当前账户状态：Red");
	}

	public void withdraw(double amount) {
		System.out.println("账户已经冻结，取款失败！");
	}
}
