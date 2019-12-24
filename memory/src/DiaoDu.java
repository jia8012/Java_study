import java.util.Scanner;

class Node{
	String name;
	int priority;
	int runtime;
	int arrivaltime;
	int starttime;
	int endtime;
	int turntime;  //周转时间
	double dturntime;  //带权周转时间
	Node nextnode;
	int statu;
	int newarrival;
	int newruntime;

	public Node(String name,int priority,int runtime,int arrivaltime, int starttime, int endtime, int turntime, double dturntime){
		this.name = name;
		this.priority = priority;
		this.runtime = runtime;
		this.arrivaltime = arrivaltime;
		this.nextnode = null;
		this.starttime = starttime;
		this.endtime = endtime;
		this.turntime = turntime;
		this.dturntime = dturntime;
		this.newarrival = arrivaltime;
		this.newruntime = runtime;
	}

}

class Create{
	public Node createNode(Node head, String name, int priority, int runtime, int arrivaltime, int starttime, int endtime, int turntime, double dturntime){

		if(head == null){
			Node node = new Node(name,priority,runtime,arrivaltime,starttime,endtime,turntime,dturntime);
			head = node;
			return head;
		}
		Node cur = head;
		while(cur.nextnode!=null){
			cur = cur.nextnode;
		}
				Node node = new Node(name,priority,runtime,arrivaltime,starttime,endtime,turntime,dturntime);
		cur.nextnode = node;
		return head;
	}

	public void check(Node head){
		if(head == null){
			System.out.println("当前没有节点信息");
			return;
		}
		Node cur = head;
		while(cur!=null){
			System.out.println("名字:"+cur.name+",优先级:"+cur.priority+",运行时间:"+cur.runtime+",到达时间"+cur.arrivaltime);
			cur = cur.nextnode;
		}
	}
}

class Algorithm{
	private Node pre = null;
	private Node prev = null;
	private Node min = null;
	private int num = 0;
	private int start = 0;
	private double nums = 0.0;
	private int count = 0;
	private static Create create = new Create();
	private static Node CreateHead(Node head){
		Node head2 = null;
		Node cur = head;
		while(cur!=null){
			head2 = create.createNode(head2,cur.name,cur.priority,cur.runtime,cur.arrivaltime,cur.starttime,cur.endtime,cur.turntime,cur.dturntime);
			cur = cur.nextnode;
		}
		return head2;
	}

	private void endFun(){
		System.out.println("平均周转时间:" + (double) this.num / this.count + "平均带权周转时间:" + this.nums / this.count);
		this.start = 0;
		this.num = 0;
		this.nums = 0;
		this.count = 0;
	}

	private static Node toolMethod(Node min,Node prev,int start,Node head){
		min.starttime = start;
		min.endtime = min.starttime + min.runtime;
		min.turntime = min.endtime - min.arrivaltime;
		min.dturntime = (double) min.turntime / (double) min.runtime;
		System.out.println("名字:" + min.name + ",优先级:" + min.priority + ",运行时间:" + min.runtime + ",到达时间" + min.arrivaltime + ",开始时间:" + min.starttime + ",结束时间:" + min.endtime + ",周转时间:" + min.turntime + ",带权周转时间:" + min.dturntime);
		if (prev == null) {
			if (min.nextnode == null) {
				return null;
			}
			return min.nextnode;
		} else {
			prev.nextnode = min.nextnode;
		}
		return head;
	}

	private static Node findMin(Node head){
		Node cur = head;
		Node real = null;
		int mintime = cur.arrivaltime;
		while(cur!=null){
			if(cur.arrivaltime<=mintime){
				mintime = cur.arrivaltime;
				real = cur;
			}
			cur = cur.nextnode;
		}
		return real;
	}

	public void Fcfs(Node head) {
		Node head2 = CreateHead(head);
		while (head2 != null) {
			min = null;
			pre = null;
			Node cur = head2;
			int mintime = cur.arrivaltime;
			while (cur != null) {
				if (cur.arrivaltime <= mintime) {
					mintime = cur.arrivaltime;
					prev = pre;
					min = cur;
				}
				pre = cur;
				cur = cur.nextnode;
			}
			if (min.arrivaltime > start) {
				start = min.arrivaltime;
			}
			head2 = toolMethod(min,prev,start,head2);
			start = start + min.runtime;
			num += min.turntime;
			nums += min.dturntime;
			count++;
		}
		this.endFun();
	}

	public void Priority(Node head){
		Node head2 = CreateHead(head);
		while(head2!=null){
			min = null;
			pre = null;
			Node cur = head2;
			int mintime = 0;
			while(cur!=null){
				if(cur.priority >= mintime && cur.arrivaltime <= start){
					mintime = cur.priority;
					prev = pre;
					min = cur;
				}
				pre = cur;
				cur = cur.nextnode;
			}
			if(min == null){
				min = findMin(head2);
			}
			if(min.arrivaltime > start){
				start = min.arrivaltime;
			}
			head2 = toolMethod(min,prev,start,head2);
			start = start + min.runtime;
			num += min.turntime;
			nums += min.dturntime;
			count++;
		}
		this.endFun();
	}

	public void ShortProcess(Node head){
		Node head2 = CreateHead(head);
		while(head2!=null){
			min = null;
			pre = null;
			Node cur = head2;
			int mintime = 1000;
			while(cur!=null){
				if(cur.runtime <= mintime && cur.arrivaltime <= start){
					mintime = cur.runtime;
					prev = pre;
					min = cur;
				}
				pre = cur;
				cur = cur.nextnode;
			}
			if(min == null){
				min = findMin(head2);
			}
			if(min.arrivaltime > start){
				start = min.arrivaltime;
			}
			head2 = toolMethod(min,prev,start,head2);
			start = start + min.runtime;
			num += min.turntime;
			nums += min.dturntime;
			count++;
		}
		this.endFun();
	}

	private static double resRatio(Node node,int start){
		int waittime = start - node.arrivaltime;
		return (double)waittime/node.runtime;
	}
	public void Hreponse(Node head){
		Node head2 = CreateHead(head);
		while(head2!=null){
			min = null;
			pre = null;
			Node cur = head2;
			double mintime = 0.0;
			while(cur!=null){
				double resratio = resRatio(cur,start);
				if(resratio >= mintime && cur.arrivaltime <= start){
					mintime = resratio;
					prev = pre;
					min = cur;
				}
				pre = cur;
				cur = cur.nextnode;
			}
			if(min == null){
				min = findMin(head2);
			}
			if(min.arrivaltime > start){
				start = min.arrivaltime;
			}
			head2 = toolMethod(min,prev,start,head2);
			start = start + min.runtime;
			num += min.turntime;
			nums += min.dturntime;
			count++;
		}
		this.endFun();
	}

	public static Node QueueHead(Node head){
		Node cur = head;
		Node nodemin = null;
		Node head2 = null;
		int min = 1000;
		int count = 0;
		while(cur!=null){
			count++;
			cur = cur.nextnode;
		}
		while(count!=0) {
			min = 1000;
			cur = head;
			while (cur != null) {
				if (cur.arrivaltime < min && cur.statu == 0) {
					nodemin = cur;
					min = cur.arrivaltime;
				}
				cur = cur.nextnode;
			}
			nodemin.statu = 1;
			count--;
			head2 = create.createNode(head2,nodemin.name,nodemin.priority,nodemin.runtime,nodemin.arrivaltime,nodemin.starttime,nodemin.endtime,nodemin.turntime,nodemin.dturntime);
		}
		return head2;
	}

	public static void insert(Node head,Node min){
		Node cur = head;
		Node pre = null;
		while(cur!=null){
			if(cur.arrivaltime > min.newarrival){
				pre.nextnode = min;
				min.nextnode = cur;
				return;
			}
			pre = cur;
			cur = cur.nextnode;
		}
		pre.nextnode = min;
		min.nextnode = cur;
	}

	public void Roundrobin(Node head,int Rtime){
		Node newnode = null;
		Node head2 = QueueHead(head);
		create.check(head2);
		System.out.println(head2.newruntime);
		System.out.println(head2.newarrival);
		while(head2!=null){
			min = head2;
			if(min.arrivaltime > start){
				start = min.arrivaltime;
			}
			if(min.newruntime > Rtime){
				min.newruntime -= Rtime;
				start += Rtime;
				min.newarrival += Rtime;
				newnode = new Node(min.name,min.priority,min.runtime,min.arrivaltime,min.starttime,min.endtime,min.turntime,min.dturntime);
				newnode.newarrival = min.newarrival;
				newnode.newruntime = min.newruntime;
				insert(head2,newnode);
				head2 = min.nextnode;
			}else{
				start += min.newruntime;
				min.endtime = start;
				min.turntime = min.endtime - min.arrivaltime;
				min.dturntime = (double) min.turntime / (double) min.runtime;
				head2 = min.nextnode;
				num += min.turntime;
				nums += min.dturntime;
				count++;
				System.out.println("名字:" + min.name + "、优先级:" + min.priority + "、运行时间:" +  min.runtime + "、到达时间" + min.arrivaltime + "、开始时间:" + min.starttime + "、结束时间:" + min.endtime + "、周转时间:" + min.turntime + "、带权周转时间:" + min.dturntime);
			}
		}
		this.endFun();
	}
}

public class DiaoDu {
	public static void dispatchMenu(Node head){

		Scanner sc = new Scanner(System.in);
		Algorithm al = new Algorithm();
		int count = 1;
		while(count == 1){
			System.out.println("请选择调度算法:");
			System.out.println("1.先来先服务算法");
			System.out.println("2.短作业优先算法");
			System.out.println("3.高优先级优先算法");
			System.out.println("4.高响应比优先算法");
			System.out.println("5.时间片轮转算法");
			System.out.println("0.退出");
			int num = sc.nextInt();
			switch(num){
				case 1:al.Fcfs(head);
					break;
				case 2:al.ShortProcess(head);
					break;
				case 3:al.Priority(head);
					break;
				case 4:al.Hreponse(head);
					break;
				case 5:al.Roundrobin(head,1);
					break;
				case 0:count = 0;
					break;
				default:System.out.println("输入错误请重新输入");
			}
		}
	}

	public static void mainMenu(){
		Create create = new Create();
		Node head = null;

		Scanner sc = new Scanner(System.in);

		int count1 = 1;
		while(count1 == 1){
			System.out.println("请选择你需要的服务:");
			System.out.println("1.添加新进程");
			System.out.println("2.使用调度算法进行排序");
			System.out.println("3.查看当前进程信息");
			System.out.println("0.退出");
			int num = sc.nextInt();
			switch(num){
				case 1:
					String name;
					int priority;
					int runtime;
					int arrivaltime;
					System.out.println("请输入进程名字:");
					name = sc.next();
					System.out.println("请输入进程优先级:");
					priority = sc.nextInt();
					System.out.println("请输入进行运行时间:");
					runtime = sc.nextInt();
					System.out.println("请输入进程到达时间:");
					arrivaltime = sc.nextInt();
					head = create.createNode(head,name,priority, runtime,arrivaltime,0,0,0,0);
					break;
				case 2:DiaoDu.dispatchMenu(head);
					break;
				case 3:create.check(head);
					break;
				case 0:count1 = 0;
					break;
				default:System.out.println("输入错误请重新输入");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiaoDu.mainMenu();
	}
}