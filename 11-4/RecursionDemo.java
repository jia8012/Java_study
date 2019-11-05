public class RecursionDemo{	


	public static void printNumber(int n) {
			if (n < 10) {
				System.out.printf("%d ", n);
			} else {
				除了最低位之外，进行递归
				int m = n / 10;
				printNumber(m);
				// 打印最低位
				int o = n % 10;
				System.out.printf("%d ", n);
			}
	}
	
	
	// public static int sumNumber(int n) {
		// if (n < 10) {
			// return n;
		// } else {
			// int m = n / 10;
			// int o = n % 10;
			// int h = sumNumber(m);
			// int r = h + o;
			// return r;
		// }
	// }
	public static int sumNumber(int n) {
		if (n < 10) {
			return n;
		} else {
			
			return sumNumber(n / 10) + n % 10;
		}
	}

	public static void main(String[] args) {
		//printNumber(9527);	// "9 5 2 7 "
		System.out.println(sumNumber(9527));
		
	}
}







