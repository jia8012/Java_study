package Queue;

import java.util.Stack;

//用栈实现队列
class MyQueue {
	Stack<Integer> stack;
	Stack<Integer> stack2;


	/** Initialize your data structure here. */
	public MyQueue() {
		stack = new Stack<>();
		stack2 = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		stack.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {  //删除队列首元素
		if (stack2.isEmpty()) {
			int size = stack.size();
			for (int i = 0; i < size; i++) {
				stack2.push(stack.pop());
			}
		}
		return stack2.pop();
	}

	/** Get the front element. */
	public int peek() {  //返回队列首元素
		if (stack2.isEmpty()) {
			int size = stack.size();
			for (int  i = 0; i < size; i++) {
				stack2.push(stack.pop());
			}
		}
		return stack2.peek();

	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stack.isEmpty() && stack2.isEmpty();

	}

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		System.out.println(queue.peek());  // 获取队列首 返回 1
		System.out.println(queue.pop());   // 删除队列首元素  返回1
		queue.push(3);
		System.out.println(queue.pop());   // 删除队列首元素  返回2
		System.out.println(queue.peek());  // 获取队列首元素  返回3
		System.out.println(queue.pop());   // 删除队列首元素  返回3
		queue.push(4);
		System.out.println(queue.empty()); // 返回   false
		System.out.println(queue.peek());  // 获取队列首元素  返回4
		System.out.println(queue.empty()); // 返回   false
	}
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */