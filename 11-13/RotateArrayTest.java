import java.util.*;
public class RotateArrayTest{
	public static void main(String[] args){
		RotateArray test = new RotateArray();
		Scanner a = new Scanner(System.in);
		while(true){
			System.out.println("请输入左旋数组元素的个数：");
			int rotateNum = a.nextInt()%test.size;
			test.rotateArray(test.array, rotateNum);
			System.out.println(Arrays.toString(test.array));
			System.out.println("------------------------------------");
		}
	}
}