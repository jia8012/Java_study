import java.util.Arrays;
public class binarySearch{
	public static int binarySearch(int[] a, int value){
		int left = 0;
		int right = a.length-1;
		while(left < right){
			int mid = (left + right)/2;
			if(value == a[mid]){
				return mid;
			}else if(value < a[mid]){
				right = mid-1;
			}else{
				left = mid +1;
			}
			//System.out.println(1);
		}
		return -1;
		
	}
	public static void main(String[] args){
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(arr1,3));
	}
}