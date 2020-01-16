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


	//移除元素
	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for( int j = 0; j < nums.length; j++) {
			if(nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}

	//搜索插入位置(二分查找)
	public int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		String str = "asdaCASE";
		System.out.println(str.toLowerCase());
		int[] arr = {1,2,3,4,5,6};
		rotateArray(arr,2);
		System.out.println(removeElement(arr, 3));
	}
}
