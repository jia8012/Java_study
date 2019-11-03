public class Array{
	
	public static int max(int[] a){
		int max = a[0];
		for(int v:a){
			if(v>max) max = v;
		}
		return max;
	}
	
	public static double aver(int[] a){
		int sum = 0;
		for(int v:a){
			sum +=v;
		}
		return 1.0*sum/a.length;
	}
	
	public static int indexOf(int[] a, int n){
		for(int i = 0; i <= a.length-1; i++){
			if(a[i] == n) return i;
		}
		return -1;
	}
	
	public static int lastIndexOf(int[] a,int n){
		for(int i = a.length-1; i >=0; i--){
			//System.out.println(i);
			if(a[i] == n) return i;
		}
		return -1;
	}
	public static void main(String[] args){
		int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9,5};
		int arrMax = max(arr);
		System.out.println(arrMax);
		double average = aver(arr);
		System.out.println(average);
		int find = 5;
		int indexOf = indexOf(arr,find);
		System.out.println(indexOf);
		int lastIndexOf = lastIndexOf(arr,find);
		System.out.println(lastIndexOf);
	}
}