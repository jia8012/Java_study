public class Test {

	//最后一个单词的长度
	public int lengthOfLastWord(String s) {
		int end = s.length() - 1;
		while(end >= 0 && s.charAt(end) == ' ')
			end--;
		if(end < 0)
			return 0;
		int start = end;
		while(start >= 0 && s.charAt(start) != ' ')
			start--;
		return end - start;
	}


	//合并两个有序数组
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int len = m + n;
		for (int i = len - 1; i >= 0; i--) {
			if ((m > 0 && n > 0 && nums1[m - 1] > nums2[n - 1]) || n == 0) {
				nums1[i] = nums1[--m];
			} else {
				nums1[i] = nums2[--n];
			}
		}
	}

	//
}
