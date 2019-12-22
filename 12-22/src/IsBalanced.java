/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class IsBalanced {
	public int getHeight(TreeNode root) {
		return root == null ?
				0 : Math.max(getHeight(root.left),
				getHeight(root.right)) + 1;
	}

	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		return Math.abs(left - right) < 2
				&&isBalanced(root.left)
				&&isBalanced(root.right);
	}
}