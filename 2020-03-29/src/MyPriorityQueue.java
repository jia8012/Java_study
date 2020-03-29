import java.util.Arrays;

public class MyPriorityQueue {

	private int[] arr = new int[10];
	private int sz;

	//入队
	public  void offer(int value) {
		if (sz == arr.length) {
			arr = Arrays.copyOf(arr, arr.length * 2);
		}
		// 1. 尾插
		// 2. 向上调整
		arr[sz++] = value;
		MHeap.shiftUpSmall(arr, sz, sz - 1);
	}

	//出队
	public int poll() {
		// 1.交换
		// 2.尾删
		// 3.向下调整
		if (sz > 0) {
			int peek = arr[0];
			MHeap.swap(arr, 0, sz - 1);
			sz--;
			MHeap.shiftDownSmall(arr, sz, 0);
			return peek;
		} else {
			return -1;
		}
	}

	//获取队首元素
	public int peek() {
		return arr[0];
	}

	//判断是否为空队列
	public boolean isEmpty() {
		return sz == 0;
	}
}

