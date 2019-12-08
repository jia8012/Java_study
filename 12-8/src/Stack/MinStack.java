package Stack;

import java.util.Stack;

//实现一个最小栈
public class MinStack {
	private Stack<Integer> date;
	private Stack<Integer> helper;

	public MinStack(){
		date = new Stack<>();
		helper = new Stack<>();
	}

	//数据栈和辅助栈在任何时候都同步

	public void push(int x) {
		//数据栈和辅助栈一定会增加元素
		date.add(x);
		if (helper.isEmpty() || helper.peek() >= x) {
			helper.add(x);
		} else {
			helper.add(helper.peek());
		}
	}

	public void pop(){
		//两个栈都得删除
		if (!date.isEmpty()) {
			date.pop();
			helper.pop();
		}
	}

	public int top() {
		if (!date.isEmpty()) {
			return date.peek();
		}
		throw new RuntimeException("栈中元素为空，此操作非法");
	}

	public int getMin() {
		if (!helper.isEmpty()) {
			return helper.peek();
		}
		throw new RuntimeException("栈中元素为空，此操作非法");
	}
}
