import java.util.Arrays;

public class ArrayCopy{
	
	public static int[] copyOfRange(int[] a, int from, int num){
		int[] copy = new int[num];   //下标 from - to 的元素复制，一共 to - from个元素
		for(int i = from; i < from + num; i++){
			copy[i-from] = a[i];
		}
		return copy;
	}
	
	public static int[] arrayCopy(int[] a, int aFrom, int[] b, int bFrom, int num){
		if(a == b){  //判断 a 和 b 是否指向同一个数组对象
			int[] tempArray = copyOfRange(a, aFrom, num);  //a数组从aFrom开始，复制num个元素
			for(int i = bFrom; i < bFrom + num; i++){
				b[i] = tempArray[i - bFrom];
			}
			return b;
		}else{
			for(int i = bFrom; i < bFrom + num; i++){
				b[i] = a[aFrom + i - bFrom];
			}
			return b;
		}
	}
	
	public static void main(String[] args){
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		//a数组的下标3开始取出3个元素，赋值给b数组，从第4个下标开始赋值
		System.out.println(Arrays.toString(arrayCopy(a,3,b,4,3)));
		//结果：[0, 0, 0, 0, 3, 4, 5, 0, 0, 0]
		int[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(arrayCopy(c,3,c,4,3)));
		//结果：[0, 1, 2, 3, 3, 4, 5, 7, 8, 9]
	}
}