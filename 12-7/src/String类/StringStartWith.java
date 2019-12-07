package String类;

import java.util.Arrays;
import java.util.Date;

public class StringStartWith {
	public static void main(String[] args) {
		String myDream1 = " 我有一个梦想，幽谷上升，高山下降。";
		String myDream2 = "坎坷曲折之路成坦途。";
		String myDream3 = "明月几时有";
		String myDream4 = "把酒问青天";
		String myDream5 = "192.168.1.1";
		System.out.println(myDream1.startsWith("我"));  //判断字符串首字符是不是"我"
		System.out.println(myDream1.startsWith(" "));
		System.out.println(myDream1.startsWith("有"));
		System.out.println(myDream2.endsWith("坎坷"));    //判断字符串尾字符是不是"坎坷"
		System.out.println(myDream2.endsWith("途"));
		System.out.println(myDream2.startsWith("曲",2));  //从第三个字符开始，判断
		char[] arr = myDream1.toCharArray();                           //首字符不是"曲"
		System.out.println(Arrays.toString(arr));    //字符串转数组
		System.out.println(myDream1.contains("幽谷上升"));   //判断子字符串是否存在
		System.out.println(myDream1.substring(13));    //截取字符串，传入位置索引，直至字符串尾
		System.out.println(myDream1.substring(8,12));  //截取字符串，传入第一个位置索引，直至第二个位置索引
		System.out.println(myDream1.replace("幽谷上升",myDream3));

		String str1 = "0123456789abc\\d";      //  "\\d" 正则表达式，表示0-9中的任何一个数字
		System.out.println(str1.replace("\\d","*"));  //replace不知道正则表达式
		System.out.println(str1.replaceAll("\\d","*"));  //replace知道正则表达式
		System.out.println(str1.replaceFirst("\\d","o"));  //将指定的第一个字符替换
		System.out.println(str1.replaceFirst("34","三"));

		System.out.println(Arrays.toString(myDream1.split("一个")));  //字符串的拆分
		System.out.println(Arrays.toString(myDream5.split("\\.")));
		System.out.println(Arrays.toString(myDream5.split("\\.",2))); //拆分限制次数

		String str2 = "125a:562a:980";
		System.out.println(str2);
		System.out.println(str2.replaceFirst("2", ":"));  //先把第一个"2"换成":"，再用":"分割
		System.out.println(Arrays.toString(str2.replaceFirst("2", ":").split(":",3)));


		String str3 = "abc DEF";
		System.out.println(str3.toLowerCase());  //转小写
		System.out.println(str3.toUpperCase());  //转大写

		String str4 = " [1  2   3    4]    ";
		System.out.println(str4.trim());  //去除字符串两边的空格内容          //"\\s"正则表达式表示" "
		System.out.println(str4.replaceAll("\\s",""));  //将所有的空白字符换成空字符

		String str5 = "abc";
		String str6 = "ABC";
		System.out.println("区分大小写的比较：" + str5.equals(str6));
		System.out.println("不区分大小写的比较：" + str6.equalsIgnoreCase(str5));

		//System.out.println("请输入账号：");
		//Scanner scanner = new Scanner(System.in);
		//String str7 = scanner.nextLine();
		//if (str7.replaceAll("\\s","").equalsIgnoreCase(str3.replaceAll("\\s",""))) {
		//	System.out.println("存在");
		//} else {
		//	System.out.println("账号不存在");
		//}

		Date date = new Date();   //字符串格式化
		String s = String.format("%te" , date);
		String day = String.format("%tj", date);
		int days = 365 - Integer.parseInt(day);
		System.out.println( "今年还有" + days);
		System.out.println("现在时间" + date);
		System.out.println("今天是本月的" + s + "号");

		System.out.println("全部时间信息：" + new String(String.format("%tc",date)));
		System.out.println("year-month-day : " + new String(String.format("%tF",date)));

		//常规类型格式化
		String a1 = String.format("%c",'X');
		System.out.println("字母x的大写：" + a1);
		System.out.println(String.format("%%"));
		System.out.println(String.format("天才是由%d%%的灵感和%d%%的汗水。",1,99));
		

	}
}
