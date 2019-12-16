import java.util.ArrayList;
import java.util.List;

public class ShiftGrid {
	//leetcode 1260.二维网格迁移

	public List<List<Integer>> shiftGrid(int[][] grid, int k) {
		//如果移动次数K是二维数组的大小及整数倍时，数组状态不发生变化
		int times = k % (grid.length * grid[0].length);

		int temp, col = grid.length, row = grid[0].length;
		//先把grid[最后一行][最后一列]的元素保存起来，然后往后遍历
		//遍历times次
		for (int n = 0; n < times; n++) {
			temp = grid[col - 1][row - 1];
			for (int j = row - 1; j >= 0; j--) { //行
				for (int i = col - 1; i >= 0; i--) {  //列
					if (j == 0 && i == 0) {
						grid[j][i] = temp;
					} else {
						if (i == 0) { //列等于0时，存储上一行最后一列的元素
							grid[j][i] = grid[j - 1][col - 1];
						} else {
							grid[j][i] = grid[j][i - 1];
						}
					}
				}
			}
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int[] griditem: grid) {
			ArrayList<Integer> p = new ArrayList<>();
			for (int item: griditem) {
				p.add(item);
			}
			result.add(p);
		}
		return result;
	}
}
