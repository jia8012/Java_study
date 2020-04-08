package 多线程;

public class 多线程不干扰 {
	private static long N = 1_0000_0000;  //静态属性，共享的，没修改
	private static class 计算线程 extends Thread {
		@Override
		public void run() {
			long n = 0;  // 有修改，是局部变量，不共享
			for (int i = 0; i < N; i++) {
				n += i;
			}
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		Thread t1 = new 计算线程();
		Thread t2 = new 计算线程();
		Thread t3 = new 计算线程();
		Thread t4 = new 计算线程();
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		/*String str1 = "hello";
		String str2 = "he";
		str2 += "llo";
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);*/


		/*int i = 0;
		Integer j = new Integer(0);
		System.out.println(i == j);
		System.out.println(j.equals(i));*/
	}
}
