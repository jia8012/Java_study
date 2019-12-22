import java.util.LinkedList;
import java.util.Queue;

public class IsCompleteBinaryTree {
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isComleteTree(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		if (root != null) {
			queue.offer(root);
		}
		while (!queue.isEmpty()) {
			TreeNode topNode = queue.poll();
			if (topNode == null) {
				break;
			}
			queue.offer(topNode.left);
			queue.offer(topNode.right);
		}
		while (!queue.isEmpty()) {
			TreeNode topNode = queue.poll();
			if (topNode != null) {
				return false;
			}
		}
		return true;
	}
}
