import java.util.*;

public class RotateArray{
	//属性
	public int[] array;
	public int size;
	
	//构造方法
	public RotateArray(){
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// this.array = array;
		// size = 10;
		System.out.println("请输入数组长度：（1-10）");
		Scanner num = new Scanner(System.in);
		this.size = num.nextInt();
		this.array = Arrays.copyOfRange(array, 0, size);
	}
	
	//方法
	public void rotateArray(int[] array, int rotateNum){  //4
		int[] tmp1 = Arrays.copyOfRange(array, 0, rotateNum);
		int[] tmp2 = Arrays.copyOfRange(array, rotateNum, size);
		System.out.println(Arrays.toString(tmp1));
		System.out.println(Arrays.toString(tmp2));
		System.arraycopy(tmp2, 0, array, 0, tmp2.length);
		System.arraycopy(tmp1, 0, array, size - rotateNum, tmp1.length);
	}
}