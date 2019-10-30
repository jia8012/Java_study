public class JavaTest{
	public static void main(String[] args){
		//final double PI = 3.14;   //声明常量
		//PI = 1.1;  //再次给常量赋值会出错
		//System.out.println("常量PI的值为:" + PI);
        //System.out.println("半径为3的圆的周长为：" + PI*2*3);
		//System.out.println("半径为4的圆的面积为：" + PI*4*4);
		//int x;      //声明int型x变量
		//int x,y;    //同时声明int型x，y变量
		//int x=10,y=-5;  //同时声明int型x，y变量并赋予初值
		//int x=5+23;
		//int a=15;
		//int b=20;
		//int c=a+b;
		//System.out.println(c);  //输出35
		
		//byte a;
		//byte a,b,c;
		//byte a=19,b=-45;
		//byte a=19-5;
		
		//int a=123456789;
		//int b=987654321;
		//int c=a*b;
		//long number=(long)c;    //结果错误，c的值超出int范围
		
		//long right=123456789*987654321L;
		//long wrong=123456789*987654321;
		//System.out.println("正确的计算结果是："+right);
		//System.out.println("错误的计算结果是："+wrong);
		
		//int a = 11;
		//System.out.println(a);
		//int b = 0011;
		//System.out.println(b);
		//int c = 0x11;
		//System.out.println(c);
		
		//int a = 077;
		//System.out.println(a);
		//int b = 001;
		//System.out.println(b);
		//int c = 0xFF;
		//System.out.println(c);
		
		// float f1 = 13.23f;
		//double d1 = 4562.12d;
		//double d2 = 45678.1564;    //默认情况下小数都被看做double型，若使用float型，需要在后面加上F或者f
		
		//double a = 4.35*100;         //浮点值时近似值，运算后结果可能与实际有偏差
		//System.out.println("a = " + a);
		//int b = (int) a;
		//System.out.println("b = " + b);
		//System.out.println("a的四舍五入的值 = " + Math.round(a));  //使用四舍五入
		
		double a = 0.1;
		double b= 2.0-1.9;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("a == b 的结果是：" + (a == b) );  //a!=b

		boolean bool = Math.abs(a - b) < (1e-6);
		System.out.println("两数之差绝对值小于最小数的结果：" + bool);
		
		}
}



















