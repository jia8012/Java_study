package 状态模式;

//具体状态类，绿色状态
public class GreenState extends AccountState{
	public GreenState(AccountState state) {
		System.out.println("当前账户状态：Green");
		this.acc = state.acc;
		this.balance = state.balance;
	}

	public GreenState(double balance, Account acc) {
		this.acc = acc;
		this.balance = balance;
	}

	@Override
	public void stateCheck() {
		if (this.balance < 0 && this.balance >= -1000) {
			acc.setState(new YellowState(this));
		} else if (this.balance < -1000) {
			acc.setState(new RedState(this));
		} else System.out.println("当前账户状态：Green");
	}
}
