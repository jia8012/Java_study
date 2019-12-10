class Solution {
	public static boolean checkPossibility ( int[] nums) {
		int size = nums.length;
		int count = 0;
		for (int i = size - 1; i > 0; i--) {
			if (i > 2) {
				if (nums[i] < nums[i - 1] && nums[i - 1] == nums[i - 2]) {
					nums[i - 1] = nums[i];
					i--;
					count++;
					System.out.println("count1:" + count );
					continue;
				} else if (nums[i] < nums[i - 1]) {
					nums[i - 1] = nums[i];
					count++;
					System.out.println("count2:" + count );
				}
			} else if (nums[i] < nums[i - 1]) {
				nums[i - 1] = nums[i];
				count++;
				System.out.println("count2:" + count );
			}
		}
		if (count > 1) {
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,5,4,6,7,10,8,9};
		System.out.println(checkPossibility(arr));
	}
}