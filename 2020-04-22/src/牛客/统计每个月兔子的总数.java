package 牛客;

import java.util.Scanner;

public class 统计每个月兔子的总数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int monthCount = scanner.nextInt();
			System.out.println(getTotalCount(monthCount));
		}
	}

	public static int getTotalCount(int month){
		int[] arr = new int[100];
		arr[1] = arr[2] = 1;
		for(int i=3;i<100;i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[month];
	}
}
