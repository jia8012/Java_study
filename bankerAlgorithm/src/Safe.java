import java.util.Arrays;
class Safe{
	boolean succ = false;

	public void Safe(Process[] processes, int[] available, int resourceNum) {
		int[] safeNum = new int[processes.length];  //安全序列
		int[] work = Arrays.copyOf(available,available.length);  //初始化work信息
		int[] work2 = Arrays.copyOf(available,available.length);
		int count = 0;  //完成的进程数
		int circle = 0;  //循环圈数
		while (count < processes.length) {
			for (int i = 0; i < processes.length; i++) {
				int a;
				for (a = 0; a < resourceNum; a++) {
					//判断process[i]的finish是否为true,是true则已经完成该进程的分配及回收
					//判断process[i].need[a]是否大于work[a]，如果大于则不满足分配添条件
					//结束本次循环，寻找下一个进程
					if (processes[i].finish == true || processes[i].need[a] > work[a]) {
						break;
					}
				}
				if (a == resourceNum){
					for (int j = 0; j < resourceNum; j++) {
						work[j] += processes[i].allocation[j];
					}
					processes[i].finish = true;  //当前进程得到满足
					safeNum[count] = i;  //设置当前序号排号

					count++;   //满足进程数 + 1
					System.out.println();
					System.out.print("第" + count + "次查找：");

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println( "      < " + processes[i].name + " > 加入安全序列");
					Show show = new Show();
					show.Show(processes, resourceNum, work);
					for (int j = 0; j < resourceNum; j++) {
						work2[j] = work[j] - processes[i].allocation[j];
					}
					System.out.println(" work :     --->     work : ");
					System.out.print(Arrays.toString(work2));
					System.out.print("   --->   ");
					System.out.println(Arrays.toString(work));
				}
			}
			circle ++; //圈数 + 1
			if (count == processes.length) {
				succ = true;
				System.out.println("***********************************************");
				System.out.print("此时存在一个安全序列：");
				System.out.println(Arrays.toString(safeNum));
				System.out.println("所以当前可分配");
				System.out.println();
				break;
			}
			if (count < circle) {
				succ = false;
				System.out.println("当前系统不安全，不存在安全序列");
				break;
			}
		}
	}
}
