package 牛客;

import java.util.*;
public class DNA序列 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.next();
			int n = scanner.nextInt();
			int max = 0;
			int maxBeginIndex = 0;
			for (int i = 0; i <= str.length()-n; i++) {
				int count = 0;
				for (int j = i; j < i+n; j++) {
					if (str.charAt(j)=='G'||str.charAt(j)=='C')
						count++;
				}
				if (count > max){
					maxBeginIndex = i;
					max = count;
				}
			}
			System.out.println(str.substring(maxBeginIndex, maxBeginIndex+n));
		}
	}
}
