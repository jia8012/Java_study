package Test;

import java.util.Arrays;

public class SelectSort {
	//直选择排序法
	public void sort (int[] array) {
		int index;
		for (int i = 1; i < array.length; i++) { //控制排序次数   6个元素排序5次
			index = 0;   //初始化第一个元素地址
			for (int j = 1; j <= array.length - i; j++) {
				if (array[j] > array[index]) {
					index = j;  //元素大的地址记到 index 上
				}
			}
			int temp = array[array.length - i];
			array[array.length - i] = array[index];
			array[index] = temp;
		}
		showArray(array);

	}

	public void backSort(int[] array) {
		int index;
		for (int i = 1; i < array.length; i++) {  //控制排序次数
			index = array.length - 1;
			for (int j = array.length - 2 ; j >= i - 1; j--) {
				if (array[j] > array[index]) {
					index = j;
				}
			}
			int temp = array[i -1];
			array[i - 1] = array[index];
			array[index] = temp;
		}
		showArray(array);
	}

	private void showArray(int[] array) {
		System.out.println("选择排序的结果是：");
		for (int a : array) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		int[] array = { 63, 4, 24, 1, 3, 15 };
		int[] array2 = { 63, 4, 24, 1, 3, 15 };
		int[] array3 = { 63, 4, 24, 1, 3, 15 };
		SelectSort sorter = new SelectSort();
		sorter.sort(array);
		SelectSort sorter2 = new SelectSort();
		sorter2.backSort(array2);
		Arrays.sort(array3);
		for (int a : array3) {
			System.out.println(a);
		}
		System.out.println("----------------------");
		char[] charArray = {'t', 'i', 'm', 'e' };
		String a = new String(charArray);
		System.out.println(a);
		char[] charArray2 = {'t', 'i', 'm', 'e' };
		String a1 = new String(charArray, 2, 2);
		System.out.println(a1);
		System.out.println(a.concat(a1));
	}
}
