public class Bike{
	//属性
	String color;  //颜色
 	int nowV;      //当前速度
	int maxV;     //最高速度
	
	//构造器（构造方法）
	Bike(){
		color = "black";
		nowV = 0;
		maxV = 193;
	}
	
	Bike(String color){
		color = color;
		nowV = 0;
		maxV = 193;
	}
	
	//方法
	void setColor(String color){  //设置颜色
		this.color = color;
	}
	//匀加速
	void vUp(){
		nowV += 10;
		if(nowV > maxV)  nowV = maxV;
	}
	//匀减速
	void vDown(){
		nowV -=10;
		if(nowV < 0)    nowV = 0;
	}
	String getColor(){
		return color;
	}
	int getNowV(){
		return nowV;
	}
}















