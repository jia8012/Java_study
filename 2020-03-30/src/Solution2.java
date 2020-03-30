public class Solution2 {
	public int count(int[] A, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] > A[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
