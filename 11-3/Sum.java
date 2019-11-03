public class Sum{
	public static int Sum(int n){
		if(n<10){
			return n;
		}else{
			int m = n/10;
			int o = n%10;
			int h = Sum(m);
			int r = h+o;
			return r;
		}
	}
	public static void main(String[] args){
		System.out.println(Sum(9527));	
		}
}