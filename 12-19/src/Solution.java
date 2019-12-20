import java.util.Stack;

public class Solution {
	public boolean backspaceCompare(String S, String T) {
		Stack<Character> s = new Stack<>();
		Stack<Character> t = new Stack<>();
		for (Character c : S.toCharArray()) {
			if (c == '#' && !s.isEmpty()) {
				s.pop();
			} else if (c != '#') {
				s.push(c);
			}
		}
		for (Character c : T.toCharArray()) {
			if (c == '#' && !t.isEmpty()) {
				t.pop();
			} else if (c != '#') {
				t.push(c);
			}
		}
		if (s.size() != t.size()) {
			return false;
		}
		while (s.size() != 0) {
			if (!s.isEmpty() && !t.isEmpty() && s.pop() != t.pop())
				return false;
		}
		return true;
	}
}
