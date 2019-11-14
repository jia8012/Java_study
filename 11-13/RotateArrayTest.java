import java.util.*;
public class RotateArrayTest{
	public static void main(String[] args){
		RotateArray test = new RotateArray();
		Scanner a = new Scanner(System.in);
		while(true){
			int rotateNum = a.nextInt()%10;
			test.rotateArray(test.array, rotateNum);
			System.out.println(Arrays.toString(test.array));
			System.out.println("------------------------------------");
		}
	}
}