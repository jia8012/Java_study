public class ThisDemo{
	public String name;
	public int age;
	
	public ThisDemo(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public ThisDemo(String name){
		this(name, 0);
	}
	
	public ThisDemo(){
		this("秘密");
	}
}