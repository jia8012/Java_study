package Static;

public class Student {
	String name;  //姓名
	int age;   //年龄
	//静态变量，这个变量不再属于对象自己，而是属于所在的类，多个对象共享一份数据
	static String room;   //教室

	Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
