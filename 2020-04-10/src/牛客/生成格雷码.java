package 牛客;

public class 生成格雷码 {
	public  String[] getGray(int n) {
		//总共需要的位数
		String grayCode[] = new String[(int) Math.pow(2, n)];
		if (n == 1) {
			//如果是1挺好办的
			grayCode[0] = "0";
			grayCode[1] = "1";
			return grayCode;
		}
		//递归前n-1的格雷码
		String last[] = getGray(n - 1);
		//格雷码计算方式，前一次格雷码分两部分
		//前半部分的二进制码前加 0
		//后半部分的二进制码前加1
		for (int i = 0; i < last.length; i++) {
			grayCode[i] = "0" + last[i];
			grayCode[grayCode.length - i - 1] = "1" + last[i];
		}
		return grayCode;
	}


	public static void main(String[] args) {

	}
}
