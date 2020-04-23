package 牛客;
import java.util.Scanner;
public class 最难的问题 {

	//方法1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c >= 'A' && c < 'F') {
					System.out.print((char) ((int) c + 21));
				} else if (c > 'E' && c <= 'Z') {
					System.out.print((char) ((int) c - 5));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
