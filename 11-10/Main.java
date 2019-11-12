class Person{
	
	//两个属性 name  age
	String name;
	int  age;
	
	//普通方法
	public void sayHello(String targrt){
		System.out.println(name + " sayhello to " + targrt);
	}
	
	//构造器   用来做对象的初始化(初始化属性) 
	//像方法，不带返回值类型，方法名称必须和类名相同
	public Person(){
		name = "秘密";
		age = -1;
	}
	
	//构造方法（构造器）的重载
	public Person(String n, int a){
		name = n;
		age = a;
	}

}

public class Main{
	
	public static Person createPerson(String name, int age){
		return new Person(name, age);
	}
	
	public static void sayHello(Person p, String targrt){
		p.sayHello(targrt);
	}
	
	public static void main(String[] args){
		Person p = new Person();
		System.out.println(p.name);
		
		p.name = "Tom";
		p.age = 18;
		
		p.sayHello("Jerry");
		
	}
}















