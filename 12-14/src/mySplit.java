import java.util.Arrays;

public class mySplit {
	public static char[] mySplit(String a, char b, char c) {
		char[] a1 = a.toCharArray();
		for (int  i = 0; i < a1.length; i++) {
			if (a1[i] == b) {
				a1[i] = c;
			}
		}
		return a1;
	}

	public static void main(String[] args) {
		String a = "www baidu com";
		System.out.println(Arrays.toString(mySplit(a, ' ', '.')));
	}
}
