public class CalcAverage{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("至少输入一个数");
			return;
		}
		int i=0;
		double sum=0;
		for(i=0;i<args.length;i++){
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println(sum);
		double aver=sum/i;
		System.out.println(aver);
		
		System.out.println(-5%4);
		
		System.out.println(1==1);   //打印布尔类型（boolean）  *会出现短路
		System.out.println(1==1&2==2);   //                              *不会出现短路
		int a=-13;
		a=a>>>1;
		System.out.println(a);		
		System.out.println("---------------------------------------");		


	}
}