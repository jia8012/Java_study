package Static;

public class DemosStudent {
	public static void main(String[] args) {
		Student one = new Student("郭靖",19);
		one.room = "101教室";
		System.out.println("姓名：" + one.getName() + ", 年龄:" + one.getAge() + "， 教室：" + one.room);

		Student two = new Student("黄蓉",17);
		two.room = "102教室";
		System.out.println("姓名：" + two.getName() + ", 年龄:" + two.getAge() + "， 教室：" + two.room);

		Student three = new Student("杨过",18);
		System.out.println("姓名：" + two.getName() + ", 年龄:" + two.getAge() + "， 教室：" + two.room);
	}
}
