package 牛客;

/*二进制加法。发现一个特点。
位的异或运算跟求'和'的结果一致：
异或 1^1=0 1^0=1 0^0=0
求和 1+1=0 1+0=1 0+0=0
位的与运算跟求'进位‘的结果一致：
位与 1&1=1 1&0=0 0&0=0
进位 1+1=1 1+0=0 0+0=0
于是可以用异或运算和与运算来表示加法*/
public class 另类加法 {
	public int addAB(int A, int B) {
		int xor,and;
		while(B!=0){
			xor = A^B;
			and = (A&B)<<1;
			A=xor;
			B=and;
		}
		return A;
	}
}
