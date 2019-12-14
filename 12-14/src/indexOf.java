public class indexOf {

	public static void myIndexOf(String a, String b) {
		if (a.contains(b)) {
			//如果两个字符串都是空的，则返回0
			if (a.length() == 0 && 0 == b.length()) {
				return;
			}
			//将String转换为字符数组
			char[] str1Char = a.toCharArray();
			char[] str2Char = b.toCharArray();
			int index = 0; //追踪下标
			for (int i = 0; i < str1Char.length; i++) {
				if (str1Char[i] == str2Char[index]) {
					if (index == str2Char.length - 1) {
						System.out.println("[" + (i-index) + ","
								+ (i) + "]");
						System.out.println(i);
						break;
					}
					index++;
				}
			}
		} else {
			throw new RuntimeException("此字符串中没有此子字符串");
		}

	}
	public static void main(String[] args) {
		String str1 = new String("hello world");
		String str2 = new String("lo wo"); //index[3,7]
		String str3 = new String("world"); //index[6,10]
		myIndexOf(str1,str2);
		myIndexOf(str1,str3);


	}

}
