import java.util.Scanner;

public class Solution1 {  //小张瓶子换汽水
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();  //空瓶子
//		int cur1 = num;  //可以换的
//		int drink = 0;  //可以喝
//		while (num > 0) {
//			cur1 = num / 3;
//			drink += cur1;
//			num = num % 3 + cur1;
//			if (num == 1) {
//				break;
//			}
//			if (num == 2) {
//				drink++;
//				break;
//			}
//		}
//		System.out.println("你一共喝了" + drink);


		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();//空汽水瓶数
			int count = 0;//能喝汽水瓶数
			if (n > 0) {
				while (n > 1) {
					count += n / 3;
					n = n % 3 + n / 3;
					if (n == 2) {
						n++;
					}
				}
				System.out.println(count);
			}
		}
		sc.close();
	}
}



