package 牛客;

import java.util.Arrays;

public class 微信红包 {
	public static int getValue(int[] gifts, int n) {
		Arrays.sort(gifts);  //排序
		int ans = gifts[n/2];  //取中位数
		int num = 0;
		for(int i = 0; i < gifts.length; i++) {
			if(gifts[i] == ans) {
				num++;  //记录中位数出现的次数
			}
		}
		return num <= n/2 ? 0 : ans;  //中位数出现的次数小于等于总数的一半，输出 0，否则输出中位数
	}

  	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 2};
		int n = arr.length;
		System.out.println(getValue(arr, n));
	}
}
