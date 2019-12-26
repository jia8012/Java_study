import java.util.Scanner;

public class BankerClass {
	int[] Available;   //当前剩余可用
	int[][] Max; // 最大需求  need + all
	int[][] Alloction;//已分配
	int[][] Need;//当前需要
	int[][] Request;//请求数据
	int[] Work;//工作向量
	int k, kk;   //k 资源数（列）      kk  进程数（行）
	int num = 0;// 进程编号
	boolean succ = false;
	Scanner in = new Scanner(System.in);

	public BankerClass() {
		// Max={{6,3,2},{5,6,1},{2,3,2}};
	}

	public void setSystemVariable() {// 设置各初始系统变量，并判断是否处于安全状态。
		setMax();
		setAlloction();
		printSystemVariable();
		SecurityAlgorithm();
	}

	public void setMax() {// 设置Max矩阵
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入系统资源种类数：");
		k = scanner.nextInt();
		Available = new int[k];
		for (int i = 0; i < k; i++) {
			System.out.println("请输入第" + (i + 1) + "类资源的数量");
			Available[i] = scanner.nextInt();
		}
		System.out.println("请输入系统模拟进程数：");
		kk = scanner.nextInt();
		Alloction = new int[kk][k];
		Need = new int[kk][k];
		Request = new int[kk][k];
		Work = new int[k];
		Max = new int[kk][k];
		System.out.println("请设置各进程的最大需求矩阵Max：");
		for (int i = 0; i < kk; i++) {
			System.out.println("请输入进程P" + i + "的最大资源需求量：");
			for (int j = 0; j < k; j++) {
				Max[i][j] = in.nextInt();
			}
		}
	}

	public void setAlloction() {// 设置已分配矩阵Alloction
		System.out.println("请设置请各进程分配矩阵Alloction：");
		for (int i = 0; i < kk; i++) {
			System.out.println("晴输入进程P" + i + "的分配资源量：");
			for (int j = 0; j < k; j++) {
				Alloction[i][j] = in.nextInt();
			}
		}

		System.out.println("Available=Available-Alloction.");
		System.out.println("Need=Max-Alloction.");

		for (int i = 0; i < k; i++) {   // 设置Available矩阵
			for (int j = 0; j < kk; j++) {
				Available[i] = Available[i] - Alloction[j][i];
			}
		}
		for (int i = 0; i < kk; i++) {// 设置Need矩阵
			for (int j = 0; j < k; j++) {
				Need[i][j] = Max[i][j] - Alloction[i][j];
			}
		}
	}

	public void printSystemVariable() {
		System.out.println("此时资源分配量如下：");
		System.out.println("进程  " + "   Max   " + "   Alloction " + "    Need  " + "     Available ");
		for (int i = 0; i < kk; i++) {
			System.out.print("P" + i + "  ");
			for (int j = 0; j < k; j++) {
				System.out.print(Max[i][j] + "  ");
			}
			System.out.print("|  ");
			for (int j = 0; j < k; j++) {
				System.out.print(Alloction[i][j] + "  ");
			}
			System.out.print("|  ");
			for (int j = 0; j < k; j++) {
				System.out.print(Need[i][j] + "  ");
			}
			System.out.print("|  ");
			if (i == 0) {
				for (int j = 0; j < k; j++) {
					System.out.print(Available[j] + "  ");
				}
			}
			System.out.println();
		}
	}

	public void setRequest() {// 设置请求资源量Request

		System.out.println("请输入请求资源的进程编号：");
		num = in.nextInt();// 设置全局变量进程编号num
		System.out.println("请输入请求各资源的数量：");
		for (int j = 0; j < k; j++) {
			Request[num][j] = in.nextInt();
		}


		BankerAlgorithm();
	}

	public void BankerAlgorithm() {// 银行家算法
		boolean T = true;
		int i;
		for (i = 0; i < k; i++) {
			if (Request[num][i] > Need[num][i] || Request[num][i] > Available[i]) {
				break;    //判断请求是否满足  need 以及  available 要求、
			}
		}
		if (i == k) {
			for (i = 0; i < k; i++) {
				Available[i] -= Request[num][i];
				Alloction[num][i] += Request[num][i];
				Need[num][i] -= Request[num][i];
			}
		} else {
			System.out.println("当前没有足够的资源可分配，进程P" + num + "需等待。或" + "进程P" + num + "请求已经超出最大需求量Need.");
			T = false;
		}

		if (T == true) {
			printSystemVariable();
			System.out.println("现在进入安全算法：");
			SecurityAlgorithm();
			if(!succ) {
				for (i = 0; i < k; i++) {
					Available[i] += Request[num][i];
					Alloction[num][i] -= Request[num][i];
					Need[num][i] += Request[num][i];
				}
				printSystemVariable();
			}
		}
	}

	public void SecurityAlgorithm() {// 安全算法                //kk进程数
		boolean[] Finish = new boolean[kk];
		for (int i = 0; i < kk; i++) {
			Finish[i] = false;
		}
		int count = 0;		// 完成进程数
		int circle = 0;		// 循环圈数
		int[] S = new int[kk];// 安全序列
		for (int i = 0; i < k; i++) {	// 设置工作向量
			Work[i] = Available[i];
		}
		boolean flag = true;  //判断是否为 第一行输出
		while (count < kk) {
			if (flag) {
				System.out.println("进程  " + "   Work  " + "   Alloction " + "    Need  " + "     Work+Alloction ");
				flag = false;
			}
			for (int i = 0; i < kk; i++) {
				int l;
				for (l = 0; l < k; l++) {
					if (Finish[i] == true || Need[i][l] > Work[l]) {
						break;
					}
				}
				if (l == k) {
					System.out.print("P" + i + "  ");
					for (int m = 0; m < k; m++) {
						System.out.print(Work[m] + "  ");
					}
					System.out.print("|  ");
					for (int j = 0; j < k; j++) {
						Work[j] += Alloction[i][j];
					}
					Finish[i] = true;// 当当前进程能满足时
					S[count] = i;// 设置当前序列排号

					count++;// 满足进程数加1
					for (int j = 0; j < k; j++) {
						System.out.print(Alloction[i][j] + "  ");
					}
					System.out.print("|  ");
					for (int j = 0; j < k; j++) {
						System.out.print(Need[i][j] + "  ");
					}
					System.out.print("|  ");
					for (int j = 0; j < k; j++) {
						System.out.print(Work[j] + "  ");
					}
					System.out.println();
				}

			}

			circle++;// 循环圈数加1

			if (count == kk) {// 判断是否满足所有进程需要
				succ = true;
				System.out.print("此时存在一个安全序列：");
				for (int i = 0; i < kk; i++) {// 输出安全序列
					System.out.print("P" + S[i] + " ");
				}
				System.out.println("故当前可分配！");
				break;// 跳出循环
			}
			if (count < circle) {// 判断完成进程数是否小于循环圈数
				count = 5;
				succ = false;
				System.out.println("当前系统处于不安全状态，故不存在安全序列。");
				break;// 跳出循环
			}
		}
	}
	public static void main(String[] args) {
		boolean Choose = true;//保持程序运行
		String C;
		Scanner in = new Scanner(System.in);
		BankerClass T = new BankerClass();
		System.out.println("模拟银行家算法：");

		T.setSystemVariable();
		while (Choose == true) {
			T.setRequest();
			System.out.println("您是否还要进行请求：y/n?");
			C = in.nextLine();
			if (C.endsWith("n")) {
				Choose = false;
			}
		}
	}

}


