package 牛客练习;

import java.util.Scanner;

public class 字符串中找出连续最长的数字串 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			//获取字符串中的数字
			String[] st = str.split("\\D");
			//创建一个新的字符串，净化字符串中的数字
			String a = "";
			//把字符串数组 st 连接起来，并且用 'A' 隔开
			for (int i = 0; i < st.length; i++) {
				a += st[i] + 'A';
			}
			//重新获取字符串数组，用 A 作为分隔
			String[] nums = a.split("A");
			//创建一个新的字符串
			String result = "";
			//比较字符串数组中那个字符串元素的长度长
			for (int i = 0; i < nums.length; i++) {
				if (nums[i].length() > result.length()) {
					result = nums[i];
				}
			}
			//输出字符串数组中最长的字符串元素
			System.out.println(result);
		}
	}
}
