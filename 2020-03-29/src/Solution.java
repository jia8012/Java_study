import java.util.Scanner;
public class Solution {
	//B 插入 A, 有几种方式让A编程回文字符串
	public static boolean isHuiWen(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String A = in.nextLine();
		String B = in.nextLine();
		int count = 0;
		for (int i = 0; i < A.length(); i++) {
			StringBuilder s = new StringBuilder(A);
			s.insert(i, B);
			if (isHuiWen(s.toString())) {
				count++;
			}
		}
		System.out.println(count);
	}
}
