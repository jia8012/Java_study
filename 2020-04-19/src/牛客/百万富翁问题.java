package 牛客;

public class 百万富翁问题 {
	public static void main(String[] args) {
		int fu = 300;
		int mo = 0;
		for (int i = 0; i < 30; i++) {
			mo += Math.pow(2,i);
		}
		System.out.println(fu + " " + mo);
	}
}
