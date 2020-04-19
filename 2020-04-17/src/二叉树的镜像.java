import javax.swing.tree.TreeNode;

public class 二叉树的镜像 {
	//JAVA版本，递归互换左右子树

	public void Mirror(TreeNode root) {
		if (root == null)
			return;
		TreeNode node = root;
		TreeNode leftN = root.left;
		node.left = root.right;
		node.right = leftN;
		Mirror(node.left);
		Mirror(node.right);
	}
}
