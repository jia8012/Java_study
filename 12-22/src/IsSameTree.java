class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		val = x;
	}
}
public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null) {
			return true;
		}
		if(p == null || q == null) {
			return false;
		}
		return p.val == q.val
				&&isSameTree(p.left, q.left)
				&& isSameTree(p.right, q.right);
	}
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null)
		 	return false;
		if(isSameTree(s, t))
			return true;
		if (isSubtree(s.left, t))
			return true;
		return isSubtree(s.right, t);
	}
}
