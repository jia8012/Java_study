package Static;

//静态代码块
//public class 类名称{
//	static{
//		//静态代码块的内容
//		}
//}
public class Person {
	static {
		System.out.println("静态代码块执行");
	}

	public Person(){
		System.out.println("构造方法执行");
	}
}
