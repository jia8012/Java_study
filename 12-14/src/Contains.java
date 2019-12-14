public class Contains {
	//实现contains方法
	//将String转换为字符数组，以此进行遍历比较
	public static boolean contains(String str1, String str2) {

		//如果两个字符串都是空的，则返回true
		if (str1.length() == 0 && 0 == str2.length()) {
			return true;
		}

		//将String转换为字符数组
		char[] str1Char = str1.toCharArray();
		char[] str2Char = str2.toCharArray();

		//创建返回值result
		boolean result = false;
		//追踪所所查找字符穿(查找字符数组)的位置
		int index = 0;
		for (int i = 0; i < str1Char.length; i++) {
			if (str1Char[i] == str2Char[index]) {
				if (index == str2Char.length - 1) {  //inde等于所查找最后一个元素下标时，结果
					result = true;					 //为true，并且结束循环
					break;
				}
				index ++;
			} else {  //如果str1char剩余元素小于str2char的总元素，就没必要计较了
				if (str1Char.length - i < str2Char.length) {
					break;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String a = new String("hello world");
		String b = new String("hello");
		boolean TorF = false;
		System.out.println(TorF = contains(a,b));
		System.out.println(TorF = contains(a,"world"));
		System.out.println(TorF = contains(b,"Hello"));
	}
}
