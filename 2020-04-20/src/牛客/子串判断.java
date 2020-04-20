package 牛客;

public class 子串判断 {
	public boolean[] chkSubStr(String[] p, int n, String s) {
		boolean[] arr = new boolean[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.contains(p[i]);  // s 里面是否包含p[i]
		}
		return arr;
	}
}