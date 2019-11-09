import java.util.Arrays;
import java.util.Scanner;

public class CreateArray{
	public static void main(String[] args){
		// int[] aFromArgs = new int[args.length];
		// for(int i = 0; i < args.length; i++){
			// aFromArgs[i] = Integer.parseInt(args[i]);
		// }
		
		Scanner scanner = new Scanner(System.in);
		int[] aScannerArgs = new int[5];
		for(int i = 0; i < 5; i++){
			aScannerArgs[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(aScannerArgs));
		
	}
}