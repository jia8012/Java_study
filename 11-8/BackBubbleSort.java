import java.util.Arrays;
public class BackBubbleSort{
	
	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static int[] backBubbleSort(int[] a){
		for(int i = 1; i <= a.length; i++){ //控制次数
			for(int j = a.length-1; j >= i; j--){  // 把两个中比较小的往前送
				if(a[j] < a[j - 1]){
					swap(a, j, j - 1);
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args){
		int[] a = {2, 6, 1, 7, 4, 3, 5, 9, 8};
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] c = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(backBubbleSort(a)));
		System.out.println(Arrays.toString(backBubbleSort(b)));
		System.out.println(Arrays.toString(backBubbleSort(c)));
	}
}