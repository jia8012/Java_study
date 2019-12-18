import java.util.Arrays;

class MyArrayList {
		int[] array;
		int size;

		MyArrayList(int capacity) {
			array = new int[capacity];
			size = 0;
		}

		public MyArrayList(){
			this(10);
		}

		//insert
		public void insert (int index, int element) {
			if (index < 0 || index < size) {
				throw new ArrayIndexOutOfBoundsException(index);
			}
			boolean r = checkCapacity(1);
			if (!r) {
				ensureCapacity();
			}
			for (int i = size; i > index; i--) {
				array[i] = array[i - 1];
			}
			array[index] = element;
			size++;
		}

		public void erase(int index) {
			if (size == 0) {
				System.out.println("空的");
				return;
			}
			for (int i = index + 1; i < size; i++) {
				array[i - 1] = array[i];
			}
			array[--size] = 0;
		}
		public void pushBack(int element) {
			insert(size, element);
		}
		public void pushFront(int element){
			insert(0, element);
		}
		public void popBack() {
			erase(size - 1);
		}
		public void popFront() {
			erase(0);
		}

		private void ensureCapacity() {
			array = Arrays.copyOf(array, array.length * 2);
		}

		private boolean checkCapacity(int num) {
			return size + num <= array.length;
		}

		@Override
		public String toString() {
			return Arrays.toString(Arrays.copyOf(array, size));
		}


	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.pushBack(1);
		list.pushBack(2);
		System.out.println(list.array.length);
		list.pushBack(3);
		System.out.println(list.array.length);
		list.pushBack(4);
		System.out.println(list.array.length);
		list.pushBack(5);
		System.out.println(list.array.length);
		list.pushBack(6);
		list.pushBack(7);
		System.out.println(list.array.length);
		System.out.println(list);
	}
}
