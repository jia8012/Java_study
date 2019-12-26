class Process {
	String name;   //进程序号
	int[] max;   //最大需求资源数
	int[] allocation;   //当前已分配资源数
	int[] need;   //还需要的资源数
	boolean finish = false;

	Process(String name, int[] max, int[] allocation){
		this.name = name;
		this.max = max;
		this.allocation = allocation;
	}
	Process(){}

}