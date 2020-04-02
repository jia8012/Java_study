package 牛客练习;

import java.util.Stack;

public class Parenthesis {
	public static boolean chkParenthesis(String A, int n) {
		Stack<Character> st = new Stack<>();
		for (Character c : A.toCharArray()) {
			if (c == '(' || c == ')') {
				st.push(c);
			} else {
				return false;
			}
		}
		int i = n - 1;
		while (i >= 0) {
			if (A.charAt(i) != '(' || A.charAt(i) != ')') {
				if (st.peek() == A.charAt(i)) {
					st.pop();
					i--;
				} else {
					return false;
				}
			}
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		String a = "()()(((())))";
		System.out.println(chkParenthesis(a,a.length()));
	}
}
