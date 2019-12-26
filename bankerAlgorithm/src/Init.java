import java.util.Scanner;

class Init {   //初始化进程信息
	public void Initialization(Process[] processes, int resourceNum) {
		Scanner scanner = new Scanner(System.in);

		//初始化进程信息
		for (int i = 0; i < processes.length; i++) {
			processes[i] = new Process();
			processes[i].max = new int[resourceNum];
			processes[i].allocation = new int[resourceNum];
			processes[i].need = new int[resourceNum];
			processes[i].finish = false;
			processes[i].name = "P" + i;
			System.out.println(processes[i].name +"的max信息：");
			for (int j = 0; j < resourceNum; j++) {
				processes[i].max[j] = scanner.nextInt();
			}
			System.out.println(processes[i].name+"的allocation信息：");
			for (int j = 0; j < resourceNum; j++) {
				processes[i].allocation[j] = scanner.nextInt();
			}
			for (int j = 0; j < resourceNum; j++) {
				processes[i].need[j] = processes[i].max[j] - processes[i].allocation[j];
			}
		}
	}
}