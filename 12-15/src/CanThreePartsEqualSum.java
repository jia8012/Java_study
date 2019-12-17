public class CanThreePartsEqualSum {
	//leetcode 1013.将数组分成相等的三个部分
	public boolean canThreePartsEqualSum(int[] A) {
		int sum = 0; //先创建一个变量存储数组总元素的和
		for (int a: A) {
			sum += a;
		}
		if (sum % 3 != 0){ //如果和不能被3整除，则返回false
			return false;
		}
		int part = 0;
		int cnt = 0;
		for (int a: A) {
			part += a;
			if (part != sum/3){
				continue; //如果part不等于3的三分之一，结束本次循环。
			}
			//part等于sum的三分之一时，让part等于0，并且cnt+1
			part = 0;
			if (++cnt == 3){ //如果cnt等于三，则返回true
				return true;
			}
		}
		//不符合条件返回true
		return false;
	}
}
