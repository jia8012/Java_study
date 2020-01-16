import java.util.Arrays;

public class Solution {
	//大写转小写
	public String toLowerCase(String str) {
		return str.toLowerCase();
	}

	//右旋转数组
	public static void rotateArray(int[] nums, int k){
		if(nums.length == 1) {
			System.out.println("["+nums[0]+"]");
			return;
		}
		k = k % nums.length;
		int[] tmp1 = Arrays.copyOfRange(nums, 0, nums.length - k);
		int[] tmp2 = Arrays.copyOfRange(nums, nums.length - k, nums.length);
		System.arraycopy(tmp2, 0, nums, 0, tmp2.length);
		System.arraycopy(tmp1, 0, nums, tmp2.length, tmp1.length);
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		String str = "asdaCASE";
		System.out.println(str.toLowerCase());
		int[] arr = {1,2,3,4,5,6};
		rotateArray(arr,2);

	}
}
