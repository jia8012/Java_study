package Queue;

class Node {
	int val;
	Node next;
}

public class Queue {
	Node front;
	Node rear;
	int size;

	public Queue() {
		//空队列
		front = rear = null;
		size = 0;
	}

	public void offer(int i) {   //入队列
		if (front == null) {
			Node newNode = new Node();
			newNode.val = i;
			front = rear = newNode;
		} else {
			Node newNode = new Node();
			newNode.val = i;
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public void poll() {  //出队列
		if (front == null) {
			return;
		}
		front = front.next;

		if (front == null) {
			rear = null;
		}
		--size;
	}

	public boolean isEmpty() {  //是否是空队列
		if (front == null) {
			return true;
		}
		return false;
	}

	public int peek() {  //获取队列首元素
		return front.val;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		System.out.println(q.isEmpty());
		System.out.println(q.size);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		System.out.println(q.isEmpty());
		System.out.println(q.size);
		while (!q.isEmpty()) {
			System.out.println(q.peek());
			q.poll();
		}
	}
}
