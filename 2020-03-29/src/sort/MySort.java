package sort;

import java.util.Arrays;
import java.util.Random;

public class MySort {

	public static void swap(int[] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	//插入排序：升序
	public static void instertSort(int[] arr) {
		//可以开始认为第0个位置是排好序
		for (int i = 0; i < arr.length - 1; i++) {
			int key = arr[i + 1];
			//从i的位置进行搜索（i表示已排序数据的最后一个位置）
			int end = i;
			while (end >= 0 && arr[end] > key) {
				//把大的元素向后移动
				arr[end + 1] = arr[end];
				//继续向前搜索
				end--;
			}
			//end : -1  或者  <= key的一个位置
			arr[end + 1] = key;
		}
	}
	public static void instertSort2(int[] arr) {
		//开始可以认为第0个位置是排好序的
		for (int i = 1; i < arr.length; i++) {
			//i: 下一个待排序元素的位置
			int key = arr[i];
			//end: 已经排好序的元素的最后一个位置
			int end = i - 1;
			while (end >= 0 && arr[end] > key) {
				arr[end + 1] = arr[end];
				end--;
			}
			arr[end + 1] = key;
		}
	}

	//希尔排序：升序
	 public static void shellSort(int[] arr) {
		 //对数据进行分组
		 //每组数据进行插入排序：逻辑分组
		 //同一组数据，他们之间的间隔不一定为1
		 int gap = arr.length;
		 while(gap > 1) {
		 	gap = gap / 3 + 1;
		 	//i : 表示已排序数据的最后一个位置
			 for (int i = 0; i < arr.length - gap; i++) {
			 	int end = i;
			 	int key = arr[end + gap];

			 	while(end >= 0 && arr[end] > key) {
			 		arr[end + gap] = arr[end];
			 		end -= gap;
				}
			 	arr[end + gap] = key;
			 }
		 }
	 }


	 //选择排序：升序   (找一个最大值)
	 public static void selectSort(int[] arr) {
		//i : 未排序的最大位置
		 for (int i = arr.length - 1; i > 0; i--) {
		 	int end = i;
		 	int maxIdx = i;
		 	//从所有未排序的数据中找到最大值的索引
			 for (int j = end - 1; j >= 0; j--) {
			 	if (arr[j] > arr[maxIdx]) {
			 		maxIdx = j;
				}
			 }
			 swap(arr, maxIdx, end);
		 }

	 }

	//选择排序：升序   (找一个最大值 和 一个最小值)
	public static void selectSort2(int[] arr) {
		//i : 未排序的最大位置
		int begin = 0;
		int end = arr.length - 1;

		while (begin < end) {
			int minIdx = begin;
			int maxIdx = end;
			for (int i = begin; i <= end; i++) {
				if (arr[i] < arr[minIdx]) {
					minIdx = i;
				}
				if (arr[i] > arr[maxIdx]) {
					maxIdx = i;
				}
			}
			swap(arr, begin, minIdx);
			//如果最大值在起始位置，则经过上面的交换之后，最大值被移动到minIdx指向的位置
			if (maxIdx == begin)
				maxIdx = minIdx;
			swap(arr, end, maxIdx);
			begin++;
			end--;
		}
	}

	public static void test() {
		Random rad = new Random(2020229111);
		int num = 100000;
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = rad.nextInt();
		}
		int[] arr2 = arr.clone();

		long begin = System.nanoTime();
		instertSort(arr);
		long end = System.nanoTime();
		//System.out.printf("insertSort Time : %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);
		System.out.printf("insertSort Time : %.2fms\n", (end - begin) * 1.0 / 1000 / 1000);

		long begin2 = System.nanoTime();
		shellSort(arr2);
		long end2 = System.nanoTime();
		//System.out.printf("shellSort Time : %.4fms\n", (end2 - begin2) * 1.0 / 1000 / 1000);
		System.out.printf("shellSort Time : %.2fms\n", (end2 - begin2) * 1.0 / 1000 / 1000);

		System.out.println("已经有序：");
		long begin3 = System.nanoTime();
		instertSort(arr);
		long end3 = System.nanoTime();
		//System.out.printf("insertSort Time : %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);
		System.out.printf("insertSort Time : %.2fms\n", (end3 - begin3) * 1.0 / 1000 / 1000);

		long begin4 = System.nanoTime();
		shellSort(arr2);
		long end4 = System.nanoTime();
		//System.out.printf("shellSort Time : %.4fms\n", (end2 - begin2) * 1.0 / 1000 / 1000);
		System.out.printf("shellSort Time : %.2fms\n", (end4- begin4) * 1.0 / 1000 / 1000);

	}


	public static void test2() {
		int[] arr = {120,9,3,2,10,35,89,0,7,12};
		int[] copy = arr.clone();
		int[] copy2 = arr.clone();
		int[] copy3 = arr.clone();
		int[] copy4 = arr.clone();
		int[] copy5 = arr.clone();

		System.out.println("原数组：");
		System.out.println(Arrays.toString(arr));

		instertSort(arr);
		System.out.println("插入排序：");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(copy);
		System.out.println("sort排序：");
		System.out.println(Arrays.toString(copy));

		instertSort2(copy2);
		System.out.println("插入排序2：");
		System.out.println(Arrays.toString(copy2));

		shellSort(copy3);
		System.out.println("希尔排序：" );
		System.out.println(Arrays.toString(copy3));

		selectSort(copy4);
		System.out.println("选择排序：");
		System.out.println(Arrays.toString(copy4));

		selectSort2(copy5);
		System.out.println("选择排序2：");
		System.out.println(Arrays.toString(copy5));
	}
	public static void main(String[] args) {

		//test();

		test2();
	}
}
