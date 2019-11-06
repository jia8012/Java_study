import java.util.Arrays;
public class copyArray{
	public static int[] copyArray(int[] a, int from , int to){
		for(int i=0;i<to-from;i++){
			a[i] = arr1[from++];
	}
	public static void main(String[] args){
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		copyArray(arr1,2,6);
		System.out.println(Arrays.toString(copyArray));
	}
}