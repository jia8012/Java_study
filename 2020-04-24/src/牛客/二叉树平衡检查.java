package 牛客;

public class 二叉树平衡检查 {
	class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
			this.val = val;
		}
	}

	public boolean isBalance(TreeNode root) {
		if (root == null) return true;
		return Math.abs(depth(root.left) - depth(root.right)) <= 1;

	}
	public int depth(TreeNode root) {
		if (root == null) return 0;
		int left = 0;
		int right = 0;
		return (left = depth(root.left)) > (right = depth(root.right)) ? left + 1 :  right + 1;
	}
}
