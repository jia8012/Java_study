public class BikeDemo{
	public static void main(String[] args){
		Bike bike = new Bike();
		System.out.println("刚刚初始化：");
		System.out.println(bike.getColor());
		System.out.println(bike.getNowV());
		
		bike.setColor("粉色");
		System.out.println("涂完漆后：");
		System.out.println(bike.getColor());
		
		System.out.println("下坡");
		//bike.vUp = 60000;
		for(int i = 0; i < 22; i++){
			bike.vUp();
			System.out.println(bike.getNowV());
		}
		
		System.out.println("上坡");
		for(int i = 0; i < 22; i++){
			bike.vDown();
			System.out.println(bike.getNowV());
		}
	}
}