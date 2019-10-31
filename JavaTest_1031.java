public class JavaTest_1031
{
	public static void main(String[] args)
	{
		/*
		int year = Integer.parseInt(args[0]);
		boolean isLeapYear = (year % 400 == 0 || (year % 4 ==0 && year % 100 != 0 ) );
		if(isLeapYear){
			System.out.println(args[0] + "是闰年");
		}else{
			System.out.println(args[0] + "不是闰年");
		}
		*/
		
		/*
		int today = Integer.parseInt(args[0]);
		switch(today){
			case 0:
			        System.out.println("星期日");
					break;
            case 1:	
			        System.out.println("星期一");
					break;
            case 2:	
			        System.out.println("星期二");
					break;
            case 3:	
			        System.out.println("星期三");
					break;
            case 4:	
			        System.out.println("星期四");
					break;
            case 5:	
			        System.out.println("星期五");
					break;
            case 6:	
			        System.out.println("星期六");
					break;
		    default:
			        System.out.println("参数错误");
                  
		}
			*/
			
		/*
		int n=5;
		int i=1;
		int sum = 0;
		while(i<=n)
		{   
			int j=1;
			int factor = 1;
			while(j<=i)
			{
				factor *= j;
				j ++;
			}
			sum +=factor;
			i ++;
		}
		System.out.println(sum);
		*/
		
		/*
		int n=3;
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int index = -1;
		for( int i = 0; i < a.length; i++ ) 
		{
			System.out.println("检查之前");
			if(a[i] == n)
			{
				index = i;
				continue;
			}
			System.out.println("检查之后");
		}
		System.out.println(index);
		*/
		
		int n=3;
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int index = -1;
		for( int i = 0; i < a.length; i++ ) 
		{
			System.out.println("检查之前");
			if(a[i] == n)
			{
				index = i;
				break;
			}
			System.out.println("检查之后");
		}
		System.out.println(index);
		
	}




}













