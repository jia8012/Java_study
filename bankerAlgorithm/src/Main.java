import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入进程数量：");
		int processNum = scanner.nextInt();  //进程数量
		Process[] processes = new Process[processNum];   //存放进程信息的Process[]数组
		System.out.println("请输入资源种类数：");
		int resourceNum = scanner.nextInt();
		System.out.println("请输入可利用资源Available：");
		int[] Available = new int[resourceNum];   //存放Available信息
		for (int i = 0; i < resourceNum; i++) {
			Available[i] = scanner.nextInt();
		}

		Init init = new Init();   //初始化进程信息
		init.Initialization(processes, resourceNum);

		Show s = new Show();    //展示进程信息
		s.Show(processes, resourceNum, Available);

		Safe safe = new Safe();  //判断安全是否安全，如果安全输出安全序列，否则告诉不安全
		safe.Safe(processes, Available, resourceNum);

		Request request = new Request();
		request.request(processes,resourceNum,Available);
	}
}
