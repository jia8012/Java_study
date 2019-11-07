import java.util.Arrays;

public class MethodParameter{
	
	public static void swap(int[] a, int[] b){
		int[] t = a;
		a = b;
		b = t;    //a b的引用交换，运行结束后a b消失，并不影响arr1 arr2的交换
	}
	
	public static void swap(int[] a, int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;   
	}
	
	public static void swap(int[] a, int[] b, int from, int to){ //上个方法 重载
		for(int i = from; i<= to; i++){
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}	
	}
	
	public static void bubbleSort(int[] a){   //冒泡排序
		for(int i = 1; i < a.length; i++){   //控制次数  从第一次开始
			for(int j = 0; j < a.length - i; j++){  //控制比较前几个数  第一次比较前四个数  j=0,1,2,3  四个数 
				if(a[j] > a[j+1]){
					swap(a, j, j+1);
					
				}
			}
		}
	}
	
	public static int binarySearch(int[] a, int index){
		int left = 0;
		int right = a.length;
		while(left < right){
			int mid = (left + right)/2;
			if(index == a[mid]){
				return mid;
			}else if(index < a[mid]){
				right = mid;
			}else{
				left = mid + 1;
			}
		}
		return -1;
	}
	
	public static int[] copyOf(int[] a, int newLength){
		int[] arrOfCopy =new int[newLength];  //arrOfCopy的元素值全是0
		int length = Math.min(a.length,newLength);
		for(int i = 0; i < length; i++){
			arrOfCopy[i] = a[i];
		}
		return arrOfCopy;
		
	}
	public static void main(String[] args){
		// int[] arr1 = {1, 2, 3, 4};
		// int[] arr2 = {4, 3, 2, 1};
		// swap(arr1,arr2,0,3);   //传进去两个数组，再传进去需要交换的元素段
		// System.out.println(Arrays.toString(arr1));	
		// System.out.println(Arrays.toString(arr2));	
		
		//int[] a = { 1, 2, 3, 4, 5};
		// int[] b = { 5, 4, 3, 2, 1 };
		// int[] c = { 3, 3, 3, 3, 3 };
		// int[] d = { 1, 9, 3, 7, 7 };
		// bubbleSort(a);
		// bubbleSort(b);
		// bubbleSort(c);
		// bubbleSort(d);
		// System.out.println(Arrays.toString(a));
		// System.out.println(Arrays.toString(b));
		// System.out.println(Arrays.toString(c));
		// System.out.println(Arrays.toString(d));
		//System.out.println(binarySearch(a,5));
		int[] e = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(copyOf(e, 3)));
		System.out.println(Arrays.toString(copyOf(e, 5)));
		System.out.println(Arrays.toString(copyOf(e, 7)));
	}
}