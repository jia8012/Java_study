package 牛客;

import java.util.Scanner;
public class 超长正整数相加 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String addend = sc.nextLine();
			String augend = sc.nextLine();
			while (addend.length() != augend.length()) {
				if (addend.length() < augend.length()) addend = "0" + addend;
				else augend = "0" + augend;
			}
			addend = "0" + addend;
			augend = "0" + augend;
			int len1 = addend.length() - 1;
			int len2 = augend.length() - 1;
			String result = "";
			int t = 0;
			while (len1 != -1 && len2 != -1) {
				int x = (addend.charAt(len1) - '0') + (augend.charAt(len2) - '0') + t;
				if (x > 9) {
					result += String.valueOf(x - 10);
					t = 1;
				} else {
					result += String.valueOf(x);
					t = 0;
				}
				len1--;
				len2--;
			}
			StringBuffer sb = new StringBuffer(result);
			result = sb.reverse().toString();
			if (result.charAt(0) == '0') System.out.println(result.substring(1));
			else System.out.println(result);
		}
	}
}