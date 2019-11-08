import java.util.Arrays;

public class Equals{
	
	public static boolean equals(int[] a, int[] b){
		if(a.length != b.length){
			return false;
		}else{
			for(int i = 0; i < a.length; i++){
				if(a[i] != b[i]){
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = {1, 2, 3, 4, 5, 6};
		
		int[] c = {1, 2, 3, 4, 5, 6};
		int[] d = {1, 2, 3, 4, 5   };
		
		int[] e = {1, 2, 3, 4, 5, 6};
		int[] f = {1, 2, 3, 4, 5, 7};
		System.out.println(equals(a,b)); //判断两个数组是否相等
		System.out.println(equals(c,d));
		System.out.println(equals(e,f));
	}
	
}