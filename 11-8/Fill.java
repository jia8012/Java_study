import java.util.Arrays;
public class Fill{
	
	public static int[] fill(int[] a, int val){
		for(int i = 0; i < a.length; i++){
			a[i] = val;
		}
		return a;
	}
	
	public static int[] fill(int[] a, int val, int from, int to){
		for(int i = from; i <= to; i++){
			a[i] = val;
		}
		return a;
	}
	
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(a));  
		System.out.println(Arrays.toString(fill(a,0)));  //所有元素都赋值为-1
		System.out.println(Arrays.toString(fill(a,-1,3,6))); //下标为3-6的元素赋值为-1
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(fill(b,0,3,6))); //下标为3-6的元素赋值为0
	}
}