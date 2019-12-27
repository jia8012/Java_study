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
		init.initialization(processes, resourceNum);

		Show s = new Show();    //展示进程信息
		s.show(processes, resourceNum, Available);

		//请求是否进行安全检查
		System.out.println("进程展示完成。");
		System.out.println("是否进行安全检查？     1、Yes   other、exit");
		if (scanner.nextInt() != 1) {
			System.out.println("程序退出中......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}

		Safe safe = new Safe();  //判断安全是否安全，如果安全输出安全序列，否则告诉不安全
		safe.Safe(processes, Available, resourceNum);

		//请求分配
		System.out.println("是否进行请求资源？    1、Yes    other、Exit");
		if (scanner.nextInt() != 1) {
			System.out.println("程序退出中......");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}

		Request request = new Request();
		request.request(processes,resourceNum,Available);
	}
}
