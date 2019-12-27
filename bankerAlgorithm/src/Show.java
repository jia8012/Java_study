import java.util.Arrays;

class Show{
	public void show(Process[] processes, int resourceNum, int[] Available){
		System.out.println("进程编号  " + "max  " + " allocation " + "  need  " + " finish ");
		for (int i = 0; i < processes.length; i++) {
			System.out.print(processes[i].name + "   ");
			System.out.print(" | ");
			System.out.print(Arrays.toString(processes[i].max));
			System.out.print(" | ");
			System.out.print(Arrays.toString(processes[i].allocation));
			System.out.print("  | ");
			System.out.print(Arrays.toString(processes[i].need));
			System.out.print(" | ");
			System.out.print(processes[i].finish);
			System.out.println();  //换行
		}
	}

}
