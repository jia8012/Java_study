import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	public int findUnsortedSubarray(int[] nums) {
		int len = nums.length;
		int max = nums[0];
		int min = nums[len-1];
		int l = 0, r = -1;
		for(int i=0;i<len;i++){
			if(max>nums[i]){
				r = i;
			}else{
				max = nums[i];
			}
			if(min<nums[len-i-1]){
				l = len-i-1;
			}else{
				min = nums[len-i-1];
			}
		}
		return r-l+1;
	}

	//逆波兰表示法
	public static int evalRPN_stack(String[] tokens) {
		Stack<Integer> numStack = new Stack<>();
		Integer op1, op2;
		for (String s : tokens) {
			switch (s) {
				case "+":
					op2 = numStack.pop();
					op1 = numStack.pop();
					numStack.push(op1 + op2);
					break;
				case "-":
					op2 = numStack.pop();
					op1 = numStack.pop();
					numStack.push(op1 - op2);
					break;
				case "*":
					op2 = numStack.pop();
					op1 = numStack.pop();
					numStack.push(op1 * op2);
					break;
				case "/":
					op2 = numStack.pop();
					op1 = numStack.pop();
					numStack.push(op1 / op2);
					break;
				default:
					numStack.push(Integer.valueOf(s));
					break;
			}
		}
		return numStack.pop();
	}

	//子集
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		backtrack(0, nums, res, new ArrayList<Integer>());
		return res;

	}

	private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
		res.add(new ArrayList<>(tmp));
		for (int j = i; j < nums.length; j++) {
			tmp.add(nums[j]);
			backtrack(j + 1, nums, res, tmp);
			tmp.remove(tmp.size() - 1);
		}
	}


}
