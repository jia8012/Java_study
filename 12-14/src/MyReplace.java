public class MyReplace {
	//实现replace
	//bug:想替换的字符串的第一个字符不能出现在原字符串的第一个字符
	public static String myReplace(String a, String b,String c) {
		int index = 0; //追踪下标
		int index2 = 0;
		int index3 = 0;
		char[] str1Char = a.toCharArray();//把想要替换的字符串转换成字符数组
		char[] str2Char = b.toCharArray();//要想要替换的字符串内容转换成字符数组
		char[] str3Char = c.toCharArray();//要想要替换的字符串内容转换成字符数组
		if (a.contains(b)) {
			//如果两个字符串都是空的，则返回0
			if (a.length() == 0 && 0 == b.length()) {
				return null;
			}
			//将String转换为字符数组
			for (int i = 0; i < str1Char.length; i++) {
				if (str1Char[i] == str2Char[index]) {
					if (index == str2Char.length - 1) {
						index2 = i;
						break;
					}
					index++;
				}
			}
		} else {
			throw new RuntimeException("此字符串中没有此子字符串");
		}
		System.out.println(index);
		System.out.println(index2);
		char[] a1 = new char[index2 - index];
		for (int i = 0; i < index2 - index; i++) {
			a1[i] = str1Char[i];
		}
		char[] a2 = new char[c.length()];
		for (int  i = 0; i < c.length(); i++) {
			a2[i] = str3Char[i];
		}
		char[] a3 = new char[str1Char.length - index2 - 1];
		for (int i = 0; i < str1Char.length - index2 - 1; i++) {
			a3[i] = str1Char[index2 + i + 1];
		}
		String b1 = new String(a1);
		String b2 = new String(a2);
		String b3 = new String(a3);

		String result = b1 + b2 + b3;

		return result;

	}
	public static void main(String[] args) {
		String str1 = new String("hello world");
		String str2 = new String("tom");

		System.out.println(myReplace(str1,"ello","i"));

	}
}
