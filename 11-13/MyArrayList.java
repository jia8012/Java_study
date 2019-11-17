import java.util.Arrays;
public class MyArrayList{
	
	private int[] array;
	private int size;
	
	public MyArrayList(){
		array = new int[2];
		// array[0] = 1;
		// array[1] = 2;
		// array[2] = 3;
		// size = 3;
		size = 0;
	}
	
	//头插
	public void pushFront(int element){
		if(size + 1 > this.array.length){
			ensureCapacity();
		}
		for(int i = size; i >= 1; i--){
			array[i] = array [i-1];
		}
		array[0] = element;
		size ++;
	}
	//尾插
	public void pushBack(int element){
		if(size + 1 > this.array.length){
			ensureCapacity();
		}
		array[size++] = element;
	}
	//头删
	public void popFront(){
		for(int i = 1; i <= size - 1; i++){
			array[i - 1] = array[i];
		}
		array[--size] = 0;
	}
	//尾删
	public void popBack(){
		if(size <= 0){
			System.out.println("空了");
			return;
		}
		array[--size] = 0;
	}
	
	//中间插入
	public void insert(int element, int index){
		//i 是实心
		for(int i = size - 1; i >= index; i--){
			array[i+1] = array[i];
		}
		array[index] = element;
		size++;
	}
	//中间删除
	public void delete(int index){
		//i 是实心
		for(int i = index + 1; i <= size - 1; i++ ){
			array[i - 1] = array[i];		;	
		}
		array[--size] = 0;
		
	}
	
	//扩容  array.length*2
	private void ensureCapacity(){
		/*
		//  原来的length不够用，通常是扩大一倍
		int newLength = array.length * 2;
		int[] newArray = new int[newLength];
		for(int i = 0; i < this.array.length; i++ ){
			newArray[i] = this.array[i];
		}
		this.array = newArray;
		*/
		array = Arrays.copyOf(array,array.length*2);
	}
	
	@Override  //打印（覆写toString）
	public String toString(){
		return Arrays.toString(Arrays.copyOf(array,size));
	}
	
	public static void main(String[] args){
		MyArrayList array = new MyArrayList();
		array.pushBack(1);
		array.pushBack(2);
		System.out.println(array);
		System.out.println(array.array.length);
		array.pushBack(3);
		System.out.println(array);
		System.out.println(array.array.length);
		array.pushBack(4);
		array.pushBack(5);
		array.pushBack(6);
		array.pushBack(7);
		System.out.println(array);
		System.out.println(array.array.length);
		array.pushBack(8);
		System.out.println(array);
		System.out.println(array.array.length);
		array.pushBack(9);
		
		// System.out.println("尾插：");  		
		// System.out.println(array);  
		// array.popFront();
		// System.out.println("头删："); 
		// System.out.println(array);
		// array.delete(2);
		// System.out.println("中间删：（index = 2）"); 
		// System.out.println(array); 
		// array.pushFront(11);
		// System.out.println("头插："); 
		// System.out.println(array);
		// array.insert(10, 2);
		// System.out.println("中间插：（index = 2）"); 
		// System.out.println(array);
		// array.popBack();
		// System.out.println("尾删："); 
		// System.out.println(array);
	}
}





