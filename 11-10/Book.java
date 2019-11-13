class Book{
	//属性
	private String name;  //名字
	private String writer;  //作者
	private double price;  //价格
	private String press;  //出版社
	//构造器
	// Book(){
		// name = "Cat And Mouce";
		// writer = "Tom";
		// price = 98;
		// press = "DongMan";
	// }
	Book(String name, String writer, double price, String press){
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.press = press;
	}
	
	//getter
	String getName(){
		return name;
	}
	String getWriter(){
		return writer;
	}
	double getPrice(){
		return price;
	}
	String getPress(){
		return press;
	}
	
	//setter
	void setName(String name){
		this.name = name;
	}
	
	void addWriter(String n){    //添加作者
		writer = writer + " " + n;
	}
	
	double discount(int n){    //打折
		return 0.1 * n * price;
	}
	
	//覆写一个方法
	// @Override
	// public String toString(){
		// return String.format("《%s》 by %s \nprice: %d \npress: %s ", name, writer,price,press);
	// }
	@Override
	public String toString(){
		return String.format("《%s》 by %s", name, writer);
	}
	
	
	
}












