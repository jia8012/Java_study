import java.util.Scanner;
public class MyTime{
	private int hour;
	private int minute;
	private int second;
	private boolean b24 = true;
	
	public MyTime(int hour, int minute, int second){
		if(hour < 0 || hour >23){
			System.out.println("不支持的小时");
			return;
		}
		if(minute < 0 || minute > 59){
			System.out.println("不支持的分钟");
			return;
		}
		if(second < 0 || second > 59){
			System.out.println("不支持的秒");
			return;
		}
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString(){
		if(b24){
		return String.format("%02d:%02d:%02d", hour, minute, second);
		} else {
			String amOrPm = "AM";
			if(hour >= 12){
				amOrPm = "PM";
			}
			int h = hour;
			if(h == 0){
				h = 0;
			} else if (h >= 12){
				h -= 12;
			}
			return String.format("%s %02d:%02d:%02d",amOrPm, h,minute,second);
		}
	}
	
	public void setB24(){
		b24 = true;
	}
	public void setB12(){
		b24 = false;
	}
	//分钟加后的时间
	// public void add(int minutes){
		// if(minutes < 0){
			// System.out.println("不支持");
		// }
		// minute += minutes;
		// while (minute >= 60){
			// hour ++;
			// minute -=60;
		// }
	// }
	//分钟减后的时间
	// public void sub(int minutes){
		// if(minutes < 0){
			// System.out.println("不支持");
		// }
		// minute -= minutes;
		// while( minute <=0 ){
			// hour --;
			// minute += 60;
			// if(hour < 0){
				// hour += 24;
			// }
		// }
	// }
	
	//秒加后的的时间
	public void add(int seconds){
		second += seconds;
		while (second >= 60){
			second -= 60;
			minute += 1;
			if(minute >= 60){
				minute -= 60;
				hour ++;
				if(hour >= 24){
					hour -=24;
				}
			}
		}
		
	}
	
	//秒减后的时间
	public void sub(int seconds){
		second -= seconds;
		while(second < 0){
			minute --;
			second += 60;
			if(minute < 0){
				hour --;
				minute += 60;
				if(hour < 0){
					hour += 24;
				}
			}
		}
	}
	
	public static void main(String[] args){
		/*
		MyTime t = new MyTime(0,0,0);  
		MyTime t2 = new MyTime(12,0,0); 
		MyTime t3 = new MyTime(11,0,0);  
		MyTime t4 = new MyTime(23,0,0);  
		MyTime t5 = new MyTime(13,0,0);  
		
		System.out.println(t);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		//+ 39 mins
		// t.add(71);
		// System.out.println(t);
		// -40 mins
		// t.sub(70);
		// System.out.println(t);
		t.add(1000);
		System.out.println(t);
		t.sub(500);
		System.out.println(t);
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请按照24小时制输入");
		System.out.println("请输入时");
		int hour = scanner.nextInt();
		System.out.println("请输入分");
		int minute = scanner.nextInt();
		System.out.println("请输入秒");
		int second = scanner.nextInt();
		MyTime t = new MyTime(hour, minute, second);
		
		
		while(true){
			
			System.out.println("12还是24");
		int select = scanner.nextInt();
		while(select == 24 || select == 12){
			scanner.nextLine();
			if(select == 24){
				t.setB24();
				break;
			}else if(select == 12){
				t.setB12();
				break;
			}
		}
		System.out.println(t);
		
			//加 还是 减
			System.out.println("加 还是 减");
			select = scanner.nextInt();
			System.out.println("秒数");
			int seconds = scanner.nextInt();
			if(select == 1 ){
				t.add(seconds);
			}else {
				t.sub(seconds);
			}
			System.out.println(t);
		}
	}
}






