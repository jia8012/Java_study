import java.util.Arrays;
public class bubbleSort{
	// public static void bubbleSort(int []a){
		// for(int i = 1; i < a.length; i++){   //控制次数  次数是长度-1
			// for(int j = 0; j < a.length-i; j++){   
				// if(a[j]>a[j+1]){
					// int t = a[j];
					// a[j] = a[j+1];
					// a[j+1] = t;
				// }
			// }
		// }
	// }
	public static void bubbleSort(int []a){
		for(int i = 1; i < a.length; i++){   //控制次数  次数是长度-1
			for(int j = 1; j < a.length-i+1; j++){   
				if(a[j]<a[j-1]){
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr1 = {1,2,3};
		int[] arr2 = {3,2,1};
		int[] arr3 = {2,2,2};
		int[] arr4 = {2,3,1};
		//System.out.println(Arrays.toString(arr));
		bubbleSort(arr1);
		bubbleSort(arr2);
		bubbleSort(arr3);
		bubbleSort(arr4);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
}