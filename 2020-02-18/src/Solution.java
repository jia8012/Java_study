import java.util.Arrays;
import java.util.TreeSet;

class Solution {

	//有序数组的平方
	public  static int[] sortedSquares(int[] A) {
		int[] a = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			a[i] = A[i] * A[i];
		}
		Arrays.sort(a);
		return a;
	}

	//仅仅反转
	public static String reverseOnlyLetters(String S) {
		StringBuilder ans = new StringBuilder();
		int j = S.length() - 1;
		for (int i = 0; i < S.length(); i++) {
			if (Character.isLetter(S.charAt(i))) {
				while (!Character.isLetter(S.charAt(j)))
					j--;
				ans.append(S.charAt(j--));
			} else {
				ans.append(S.charAt(i));
			}
		}
		return ans.toString();
	}

	//按奇偶排序数组
	public int[] sortArrayByParity(int[] A) {
		int[] a = new int[A.length];
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				a[count++] = A[i];
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 1) {
				a[count++] = A[i];
			}
		}
		return a;
	}

	//寻找数组的中心索引
	public int pivotIndex(int[] nums) {
		int sum = 0, leftSum = 0;
		for (int x: nums) sum += x;
		for (int i = 0; i < nums.length; ++i) {
			if (leftSum == sum - leftSum - nums[i]) return i;
			leftSum += nums[i];
		}
		return -1;
	}

	//数组加一
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			digits[i]++;
			digits[i] = digits[i] % 10;
			if (digits[i] != 0) return digits;
		}
		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	//第三大的数 ( 红黑树 )
	public int thirdMax(int[] nums) {
		if (nums == null || nums.length == 0) throw new RuntimeException("error");
		TreeSet<Integer> set = new TreeSet<>();
		for (Integer elem : nums) {
			set.add(elem);
			if (set.size() > 3) set.remove(set.first());
		}
		return set.size() < 3 ? set.last() : set.first();
	}


	public static void main(String[] args) {
		int[] A = {-2, 1, 0, 1, 2};
		System.out.println(Arrays.toString(sortedSquares(A)));
		String a = "a-bc-def!";
		System.out.println(reverseOnlyLetters(a));
	}
}