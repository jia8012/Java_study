class Person{
	String name;
	int  age;
	public void sayHello(String targrt){
		System.out.println(name + " sayhello to " + targrt);
	}
}

public class Main{
	public static void main(String[] args){
		Person p = new Person();
		p.name = "Tom";
		p.age = 18;
		
		p.sayHello("Jerry");
		
	}
}