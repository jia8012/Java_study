package 牛客;

import java.util.Scanner;

public class 统计同成绩学生人数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num_people = scanner.nextInt();
			int[] result= new int[num_people];
			for (int i = 0; i < result.length; i++) {
				result[i] = scanner.nextInt();
			}
			int num_result = scanner.nextInt();
			while (true) {
				int num = 0;
				for (int i = 0; i < result.length; i++) {
					if (num_result == result[i]) {
						num++;
					}
				}
				System.out.println(num);
				break;
			}
		}
	}
}
