public class Bike{
	//属性
	String color;  //颜色
 	int nowV;      //当前速度
	int maxV;     //最高速度
	
	//构造方法
	Bike(){
		color = "black";
		nowV = 0;
		maxV = 182;
	}
	
	Bike(String color){
		color = color;
		nowV = 0;
		maxV = 182;
	}
	
	//方法
	void setColor(String color){
		this.color = color;
	}
	
	void vUp(){
		nowV += 10;
		if(nowV > maxV) nowV = maxV;
	}
	
	void vDown(){
		nowV -=10;
		if(nowV < 0)   nowV = 0;
	
	String color(){
		
		
	}
}

public class BikeMain{
	public static void main(String[] args){
		Bike bike = new Bike();
		b.color = "black";
		b.nowV = 30;
		b.maxV = 50;
		
		Color(whit);
		System.out.println(b.color);
	}
}
















