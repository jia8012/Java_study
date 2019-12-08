package Stack;

import java.util.Arrays;

//用线性表实现栈
class Stack{
	int[] array;
	int size;
	Stack(){
		this(10);
	}
	Stack(int size){
		array = new int[size];
		this.size = 0;
	}

	public void push(int value){
		//检查容量
		if (array.length == size){
			array = Arrays.copyOf(array, size * 2);
		}
		array[size++] = value;
	}

	public void pop(){
		if (size > 0) {
			size--;
		}
	}

	public int peek(){
		return array[--size];
	}
}
public class stackTest {


	public static void main(String[] args) {
		Stack st = new Stack();

	}
}
