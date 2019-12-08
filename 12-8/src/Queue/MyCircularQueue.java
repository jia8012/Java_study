package Queue;

class MyCircularQueue {
	private int[] array;
	private int size;
	private int front;
	private int rear;

	/** Initialize your data structure here. Set the size of the queue to be k. */
	public MyCircularQueue(int k) {
		this.array = new int[k];
		this.size = 0;
		this.front = 0;  //队列首元素下标
		this.rear = 0;   //队列尾元素下标


	}

	/** Insert an element into the circular queue. Return true if the operation is successful. */
	public boolean enQueue(int value) {
		if(isFull()){
			return false;
		}
		rear = (rear + 1) % array.length;
		array[rear] = value;
		if(size == 0) {
			front = rear;
		}
		size++;
		return true;

	}

	/** Delete an element from the circular queue. Return true if the operation is successful. */
	public boolean deQueue() {
		if (isEmpty()) {
			return false;
		}
		front = (front + 1) % array.length;
		size--;
		return true;
	}

	/** Get the front item from the queue. */
	public int Front() {
		if (isEmpty()) {
			return -1;
		}
		return array[front];
	}

	/** Get the last item from the queue. */
	public int Rear() {
		if (isEmpty()) {
			return -1;
		}
		return array[rear];
	}

	/** Checks whether the circular queue is empty or not. */
	public boolean isEmpty() {
		if (size == 0){
			return true;
		}
		return false;
	}

	/** Checks whether the circular queue is full or not. */
	public boolean isFull() {
		if (size == array.length) {
			return true;
		}
		return false;
	}
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */