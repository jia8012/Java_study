import java.util.PriorityQueue;

public class MHeap {

	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	//大堆的向下调整
	public static void shiftDownBig(int[] arr, int sz,int parent) {
		int  child = 2 * parent + 1;	//left child

		//从parent节点开始，一直调整到叶子节点结束
		while (child < sz) {
			//right child : child + 1 从两个孩子节点中选一个最大的
			if (child + 1 < sz && arr[child + 1] > arr[child]) {
				child++;
			}
			if (arr[child] > arr[parent]) {
				//如果child 大于 parent, 向下调整, 交换值
				swap(arr, child, parent);
				//更新，继续向下调整
				parent = child;
				child = 2 * parent + 1;
			} else {
				//不需要调整
				break;
			}
		}
	}

	//小堆的向下调整
	public static void shiftDownSmall(int[] arr, int sz,int parent) {
		int  child = 2 * parent + 1;	//left child

		//从parent节点开始，一直调整到叶子节点结束
		while (child < sz) {
			//right child : child + 1 从两个孩子节点中选一个最小的
			if (child + 1 < sz && arr[child + 1] < arr[child]) {
				child++;
			}
			if (arr[child] < arr[parent]) {
				//如果child < parent, 向下调整, 交换值
				swap(arr, child, parent);
				//更新，继续向下调整
				parent = child;
				child = 2 * parent + 1;
			} else {
				//不需要调整
				break;
			}
		}
	}

	public static void creatHeapBig(int[] arr) {
		//从最后一个非叶子节点向下调整
		for (int i = (arr.length - 2) / 2; i >= 0; i--) {
			shiftDownBig(arr, arr.length, i);
		}
	}

	public static void creatHeapSmall(int[] arr) {
		//从最后一个非叶子节点向下调整
		for (int i = (arr.length - 2) / 2; i >= 0; i--) {
			shiftDownSmall(arr, arr.length, i);
		}
	}

	public static void main(String[] args) {
//		int[] arr = {9, 2, 10, 15, 3, 1, 7, 23, 89};
//		int[] copy = arr.clone();  //复制数组内容
//		System.out.println(Arrays.toString(arr));
//		System.out.println("大根堆");
//		creatHeapBig(arr);
//		System.out.println(Arrays.toString(arr));
//		System.out.println("小根堆");
//		creatHeapSmall(copy);
//		System.out.println(Arrays.toString(copy));


		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(9);
		pq.offer(2);
		pq.offer(10);
		pq.offer(15);
		pq.offer(3);
		pq.offer(1);
		pq.offer(7);
		pq.offer(23);
		pq.offer(89);
		while (!pq.isEmpty()) {
			System.out.println(pq.poll() + " ");
		}
		System.out.println();
	}
}
