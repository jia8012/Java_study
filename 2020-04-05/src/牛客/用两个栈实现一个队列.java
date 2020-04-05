package 牛客;

import java.util.Stack;

public class 用两个栈实现一个队列 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		if (!stack2.isEmpty()){
			while (!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
		}
		stack1.push(node);
	}

	public int pop() {
		if (!stack1.isEmpty()) {
			while (!stack1.isEmpty()){
				 stack2.push(stack1.pop());
			}
			return stack2.pop();
		} else {
			return stack2.pop();
		}
	}

	public static void main(String[] args) {
		用两个栈实现一个队列 queue = new 用两个栈实现一个队列();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		queue.push(4);
		System.out.println(queue.pop());
		queue.push(5);
		System.out.println(queue.pop());
		System.out.println(queue.pop());


	}
}
