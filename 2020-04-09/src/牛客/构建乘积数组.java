package 牛客;

public class 构建乘积数组 {
	//别人的，理解有点费力
	public class Solution {
		public int[] multiply(int[] A) {
			int length = A.length;
			int[] B = new int[length];
			if(length != 0 ){
				B[0] = 1;
				//计算下三角连乘
				for(int i = 1; i < length; i++){
					B[i] = B[i-1] * A[i-1];
				}
				int temp = 1;
				//计算上三角
				for(int j = length-2; j >= 0; j--){
					temp *= A[j+1];
					B[j] *= temp;
				}
			}
			return B;
		}
	}
}
