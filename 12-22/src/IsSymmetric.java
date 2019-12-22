/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class IsSymmetric {
	public boolean fun (TreeNode left,TreeNode right){
		if(left == null && right == null) {
			return true;
		}
		if(left != null && right != null) {
			return left.val == right.val
					&&fun(left.left,right.right)
					&&fun(left.right,right.left);
		}
		return false;
	}
	public boolean isSymmetric(TreeNode root) {
		if(root == null) {
			return true;
		}
		return fun(root.left,root.right);
	}
}