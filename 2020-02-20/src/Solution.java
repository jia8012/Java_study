class Solution {
	//两数求和
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int dif = target - nums[i];
			// j = i + 1 的目的是减少重复计算和避免两个元素下标相同
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == dif) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}

	//二进制求和
	public String addBinary(String a, String b) {
		StringBuilder ans = new StringBuilder();
		int ca = 0;
		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
			int sum = ca;
			sum += i >= 0 ? a.charAt(i) - '0' : 0;
			sum += j >= 0 ? b.charAt(j) - '0' : 0;
			ans.append(sum % 2);
			ca = sum / 2;
		}
		ans.append(ca == 1 ? ca : "");
		return ans.reverse().toString();
	}

	//字符串转换整数
	public int myAtoi(String str) {
		if (str == null) return 0;
		str = str.trim();  //去掉字符串两端的空格
		if (str.length() == 0) return 0;
		int i = 0;
		//2.判断数字的符号
		int flag = 1;
		char ch = str.charAt(i);
		if (ch == '+') {
			i++;
		} else if (ch == '-') {
			flag = -1;
			i++;
		}
		//3.找出数字部分
		int res = 0;
		for (; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch < '0' || ch > '9')
				break;
			//溢出判断
			if (flag > 0 && res > Integer.MAX_VALUE / 10)
				return Integer.MAX_VALUE;
			if (flag > 0 && res == Integer.MAX_VALUE / 10 && ch - '0' > Integer.MAX_VALUE % 10)
				return Integer.MAX_VALUE;
			if (flag < 0 && -res < Integer.MIN_VALUE / 10)
				return Integer.MIN_VALUE;
			if (flag < 0 && -res == Integer.MIN_VALUE / 10 && -(ch - '0') < Integer.MIN_VALUE % 10)
				return Integer.MIN_VALUE;
			res = res * 10 + ch - '0';
		}
		return res * flag;
	}

	//在排序数组中查找元素的第一个和最后一个位置
	public int[] searchRange(int[] nums, int target) {
		int[] targetRange = {-1, -1};

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				targetRange[0] = i;
				break;
			}
		}

		if (targetRange[0] == -1) {
			return targetRange;
		}

		for (int j = nums.length - 1; j >= 0; j--) {
			if (nums[j] == target) {
				targetRange[1] = j;
				break;
			}
		}
		return targetRange;
	}

	//判断回文字符串，不论大小写和符号
	public boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
			while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
			if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
			i++;
			j--;
		}
		return true;
	}

	//压缩字符串
	public int compress(char[] chars) {     // 数组大小范围： 1 <= chars.length <= 1000
		int left = 0;
		int size = 0;
		// 由于最后一个字符也需要判断，所以将右指针终点放到数组之外一格
		for (int right = 0; right <= chars.length; right++) {
			// 当遍历完成，或右指针元素不等于左指针元素时，更新数组
			if (right == chars.length || chars[right] != chars[left]) {
				chars[size++] = chars[left];    // 更新字符
				if (right - left > 1) {         // 更新计数，当个数大于 1 时才更新
					for(char c : String.valueOf(right - left).toCharArray()) {
						chars[size++] = c;
					}
				}
				left = right;
			}
		}
		return size;
	}
}