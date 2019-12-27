import java.util.Scanner;
public class Request {
	public void request(Process[] processes, int resourceNum, int[] Available) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int[] request = new int[resourceNum];
			int num;  //请求分配的进程编号
			System.out.println("请输入请求分配的进程编号");
			num = scanner.nextInt();
			System.out.println("请求分配的各个资源数量：");
			for (int i = 0; i < resourceNum; i++) {
				request[i] = scanner.nextInt();
			}

			//再次请求分配时finfish都改为ture
			for (int i = 0; i < processes.length; i++) {
				processes[i].finish = false;
			}
			Banker banker = new Banker();
			banker.banker(processes, request, resourceNum, Available, num);
			System.out.println("是否继续请求分配：");
			System.out.println("1/Y  2/N");

			if (scanner.nextInt() != 1) {
				System.out.println("程序退出中......");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		}
	}
}