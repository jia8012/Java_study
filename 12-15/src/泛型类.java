public class 泛型类<T> {
	T val;

	泛型类(T val) {
		this.val = val;
	}

	T get() {
		return val;
	}

	public static void main(String[] args) {
		泛型类 a = new 泛型类(10);
		System.out.println(a.get());
	}
}
