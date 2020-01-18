public class Solution {
	public  boolean canConstruct(String ransomNote, String magazine) {

		//赎金信
		if (magazine.length() < ransomNote.length()) {
			return false;
		}
		int[] caps = new int[26];
		for (char c : ransomNote.toCharArray()) {
			int index = magazine.indexOf(c,caps[c - 'a']);
			if (index == -1) {
				return false;
			}
			caps[c - 97] = index + 1;
		}
		return true;


 	}

	//回文数
	public boolean isPalindrome(int x) {
		if (x < 0 || x % 10 == 0 && x!= 0) {
			return false;
		}
		int revertedNumber = 0;
		while (x > revertedNumber) {
			revertedNumber = revertedNumber * 10 + x % 10;
			x /= 10;
		}
		return x == revertedNumber || x == revertedNumber / 10;
	}
}
