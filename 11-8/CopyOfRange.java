import java.util.Arrays;
public class CopyOfRange{
	
	public static int[] copyOfRange(int[] a, int from, int to){
		int[] copy = new int[to - from + 1];   //下标3-6的元素复制，一共四个元素
		for(int i = from; i <= to; i++){
			copy[i-from] = a[i];
		}
		return copy;
	}
	
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
		System.out.println(Arrays.toString(copyOfRange(arr,3,6)));//复制下标3-6的元素
	}
}