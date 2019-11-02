import java.util.Random;
import java.util.Scanner;

public class GuessNum{
	
	//难度选择
	public static int selectDifficult(){
		System.out.println("1.简单");
		System.out.println("2.一般");
		System.out.println("3.地狱");
		Scanner scanner = new Scanner(System.in);
		int difficult = scanner.nextInt();
		scanner.nextLine();  //接受  数字后的回车
		return difficult;
	}
	
	//生成随机数
	public static int generateRandom(int difficult){
		Random random = new Random();           
		switch(difficult){                         //生成随机数
			case 1: return random.nextInt(50);     //50以内的数字
			case 2: return random.nextInt(100);    //100以内的数字
			case 3: return random.nextInt(150);    //150以内的数字
		}
		return -1;
		
	}
	
	//生成次数
	public static int generateTimes(int difficult){
		switch (difficult) {
			case 1: return 10;
			case 2: return 5;
			case 3: return 3;
		}
		return -1;
	}
	
	//游戏主体
	public static boolean guessNum(int r){
		System.out.println("请输入数字");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();   //接收  数字后的回车
		if(n == r){
			return true;
		}else if(n < r){
			System.out.println("你猜小了");
			System.out.println("-----------------------------");
		}else{
			System.out.println("你猜大了");
			System.out.println("-----------------------------");
		}
		return false;
	}
	
	public static void main(String[] args){
		
		//难度选择
		int difficult = selectDifficult();
		
		//生成随机数
		int r = generateRandom(difficult);
		System.out.println("随机数是：" + r);
		
		//生成次数
		int times = generateTimes(difficult);
		
		//游戏主体
		boolean success = false;
		for(int i = 1; i <= times; i++){
			success = guessNum(r);
			if(success){
				break;
			}
		}
		if(success){
			System.out.println("你真聪明");
		}else{
			System.out.println("你真笨");
		}
	}
}