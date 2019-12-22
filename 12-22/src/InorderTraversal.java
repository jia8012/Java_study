import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> ret = new ArrayList<>();
		helper(root, ret);
		return ret;
	}
	public void helper(TreeNode root, List<Integer> ret) {
		if (root != null){
			if (root.left != null){
				helper(root.left, ret);
			}
			ret.add(root.val);
			if (root.right != null){
				helper(root.right, ret);
			}
		}
	}
}
