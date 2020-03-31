package 牛客练习;

import java.util.Stack;

public class 合法括号序列判断 {
	public static boolean chkParenthesis(String A, int n) {
		Stack st = new Stack<>();
		char[] a = A.toCharArray();
		//将字符压栈
		for (char b : a) {
			st.add(b);
		}
		//left代表左括号个数
		int left = 0;
		//right代表有括号个数
		int right = 0;
		//栈为空结束循环
		while (!st.isEmpty()) {
			if (st.peek().equals('(')) {
				left++;
				st.pop();
				continue;
			}
			if (st.peek().equals(')')) {
				right++;
				st.pop();
				continue;
			}
			return false;
		}
		//左等于右 即为true
		if (left == right) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String a = "(()())";
		System.out.println(chkParenthesis(a,a.length()));
	}
}
