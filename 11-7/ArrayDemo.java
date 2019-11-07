import java.util.Arrays;
public class ArrayDemo{
	
	public static int[] createArray(int n){
		// 运行使用变量作为数组的长度
		return new int[n];
	}
	
	public static void printArray(int[] a){  //接收匿名数组
		//获取数组的长度
		int size = a.length;
		for(int i = 0; i < size; i++){
			System.out.println(a[i]);
		}
		// for(int v:a){                 //简便方法
			// System.out.println(v);
		// }
	}
	
	public static void method2(int[] a){
		System.out.println(a[9]);
	}
	public static void method1(int[] a){
		method2(a);    //函数嵌套
	}
	public static int max1(int[] a){
		int max = a[0];
		for(int i = 1; i < a.length; i++){
			if(max < a[i]){
				max = a[i];
			}
		}
		return max;
	}
	
	public static int max2(int[] a){
		int max = a[0];
		for(int v:a){
			if(max < v) {
				max = v;
			}
		}
		return max;
	}
	
	public static double average(int[] a){
		int sum = 0;
		for(int v:a){
			sum += v;
		}
		return sum*1.0/a.length;
		
	}
	
	public static int[] copyOfRange(int[] a, int from, int to){
		int[] b = new int[to - from];  //先规定b[]的大小（长度）
		for(int i = from; i < to; i++){  //  从from开始到to结束
			b[i - from] = a[i];   //i - fron == 0  a[i] == a[from]
		}
		return b;
	}
	
	public static void swap(int a, int b){
		int t = a;    
		a = b;
		b = t;       //形参的交换影响不了实参
	}                //所以结束后数组的值没有交换
	
	public static void swap(int[] arr, int a, int b){
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	// public static void printNumber(int n){
		// if(n < 10){
			// System.out.printf("%d ", n);
		// }else{
			// int m = n / 10;
			// printNumber(m);
			// int o = n % 10;
			// System.out.printf("%d ", n);
		// }
	// }   //连续打印  9  95  952  9527
	
	public static void printNumber(int n){
		if(n>10){
			int m = n/10;
			printNumber(m);
			int o = n%10;
			System.out.println(o);
		}else{
			System.out.println(n);
		}  //9  5  2  7 
	}
	
	public static int sumNumber(int n){ //每一位相加的和
		if(n < 10){
			return n;           //if两种情况都得加返回值
		}else{                  //或者在if语句外面加返回值
			int i = n % 10;   //留最后一位
			int j = n / 10;   //减少一位
			int sum = sumNumber(j);
			sum +=i;
			return sum;         //if两种情况都得加返回值
		}
	}
	public static void main(String[] args){
		//int[] a = createArray(10);
		//System.out.println(Arrays.toString(a));
		//printArray(a);
		//printArray(new int[] {3,5,2,7,9,4,8});//匿名数组  实参
		//method1(a);   //函数嵌套
		//int[] a = {4,2,1,9,8,3,7};
		//System.out.println(max1(a));
		//System.out.println(max2(a));
		//System.out.println(average(a));
		
		//int[] a = {1, 3, 4, 2, 6};
		//int[] b = copyOfRange(a,1,3);  //数组的自定义位置复制
		//System.out.println(Arrays.toString(b));
		
		// int[] array = {9, 13};
		// System.out.println(Arrays.toString(array));
		// swap(array, 0, 1);
		// System.out.println(Arrays.toString(array));
		//printNumber(9527);
		System.out.println(sumNumber(9527));
	}
}







