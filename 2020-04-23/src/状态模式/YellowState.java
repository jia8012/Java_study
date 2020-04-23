package 状态模式;

//具体状态类，黄色状态
public class YellowState extends AccountState {
	public YellowState(AccountState state) {
		System.out.println("当前账户状态：Yellow");
		this.acc = state.acc;
		this.balance = state.balance;
	}

	@Override
	public void stateCheck() {

		if (this.balance > 0) {
			acc.setState(new GreenState(this));
		} else if (this.balance < -1000) {
			acc.setState(new RedState(this));
		} else System.out.println("当前账户状态：Yellow");
	}
}
