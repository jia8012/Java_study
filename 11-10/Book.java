class Book{
	//属性
	private String name;  //名字
	private String writer;  //作者
	private double price;  //价格
	private String press;  //出版社
	//构造器
	Book(){
		name = "Cat And Mouce";
		writer = "Tom";
		price = 98;
		press = "DongMan";
	}
	
	void addWriter(String n){    //添加作者
		writer = writer +" "+ n;
	}
	
	void discount(int n){    //打折
		price = 0.1 * n * price;
	}
	
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
	
	
}