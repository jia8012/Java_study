public class HanoiTower{
	public static void hanoi(int n, int from, int to){
		if(n == 1){
			System.out.printf("从 %d 移动到 %d %n", from, to);
		}else{
			int other = 3 - from - to;
			hanoi(n - 1, from, other);
			System.out.printf("从 %d 移动到 %d %n", from, to);
			hanoi(n - 1, other, to);
		}
	}
	public static void main(String[] args){
		hanoi(3,0,2);
	}
}