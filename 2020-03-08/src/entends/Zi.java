package entends;

public class Zi extends Fu{
	int num = 20;

	public void method() {
		int num = 30;

		//局部变量直接写
		//本类的：this.成员变量名
		//父类的： super.成员变量名
		System.out.println(num);//局部变量
		System.out.println(this.num);//本类成员变量
		System.out.println(super.num);//父类成员变量
	}
}
