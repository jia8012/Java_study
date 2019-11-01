import java.util.Scanner;
public class MethodDemo{
	
	
	////a,b是形参  (parameters)
	// public static double sub(double a, double b){
		// return a - b;
	// }
	// public static void main(String[] args){
			////a,b是实参   (arguments)
		// int a = 6;
		// int b = 1;
		
		// System.out.println(sub(a,b));
	// }
	
	/*
	public static int JC(int n){
		int sum = 0;   //阶乘的和
		int x = 1;
		for(int i=1; i<=n; i++){
			x = 1;
			for(int j=1; j<=i;j++){
				x *= j;
			}
			sum += x;
		}
		return sum;
	}
	
	public static void main(String[] args){
		
		//int n = Integer.parseInt(args[0]);
		//System.out.println("1~" + n + "的阶乘的和为" + JC(n));
		
		Scanner scanner = new Scanner(System.in);
		//int n = scanner.nextInt();
		System.out.println(JC(scanner.nextInt()));
		
	}*/
	
	/*
	public static int JC(int n){
		if(n == 1){
			return 1;
		}else{
			return n*JC(n-1);
		}
	}
	
	public static void main(String[] args){
		int a = 2;
		System.out.println(JC(a));
		
	}
	*/
	
	public static int Fib(int n){
		if(n == 1 || n ==2){
			return 1;
		}else{
			return Fib(n-2)+Fib(n-1);
		}
	}	
	public static void main(String[] args){
		int n = 10;
		for(int i = 1; i <= n; i++){
		System.out.println(Fib(i));
		}
	}
	
}
























