package 牛客练习;

import java.util.Scanner;

public class 删除公共字符 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();

		char[] chars = str2.toCharArray();

		//循环用 str2 中的每一个字符隔开 str1 字符串
		for (int i = 0; i < chars.length; i++) {
			//用 chars 分割str1
			String[] st = str1.split(String.valueOf(chars[i]));
			//清空 str1
			str1 = "";
			//重新拼装str1
			for (int i1 = 0; i1 < st.length; i1++) {
				str1 += st[i1];
			}
		}
		//输出
		System.out.println(str1);
	}
}
