import java.util.Arrays;

public class Banker {
	public void banker(Process[] processes,int[] request, int resourceNum, int[] Available, int num){
		boolean T = true;
		int i;
		int k = 0;  //控制错误原因
		for (i = 0; i < resourceNum; i++) {
			if (request[i]  > processes[num].need[i] ) {
				k = 1;
				break;  //满足请求跳出循环
			}
			if (request[i] >  Available[i]) {
				k = 2;
				break;
			}
		}

		//request每种资源符合请求
		if (i == resourceNum) {
			for (i = 0; i < resourceNum; i++) {
				Available[i] -= request[i];
				processes[num].allocation[i] += request[i];
				processes[num].need[i] -= request[i];
			}

			//need都为零，进行回收
			for (i = 0; i < resourceNum; i++) {
				if (processes[num].need[i] != 0)
					break;
			}

			if (i == resourceNum) {
				for (i = 0; i < resourceNum; i++) {
					Available[i] += processes[num].allocation[i];
					processes[num].allocation[i] = 0;
				}

			}
		} else {
			System.out.println("当前可分配资源不能满足 " + processes[num].name + " 的请求");
			if (k == 1) {
				System.out.println("原因是：  request:" + Arrays.toString(request) + " > "
						+ processes[num].name + " need:" +
						Arrays.toString(processes[num].need));
			}
			if (k == 2) {
				System.out.println("原因是：  request:" + Arrays.toString(request) + " > "
						+ "Available:" +
						Arrays.toString(Available));
			}
			T = false;
		}


		if (T == true) {
			Show show = new Show();
			show.show(processes, resourceNum, Available);
			System.out.println("现在进入安全算法：");
			Safe safe = new Safe();
			safe.Safe(processes,Available, resourceNum);
			if (!safe.succ) {
				for (i = 0; i < resourceNum; i++) {
					Available[i] += request[i];
					processes[num].allocation[i] -= request[i];
					processes[num].need[i] += request[i];
				}
				show.show(processes,resourceNum,Available);
			}
		}
	}
}
