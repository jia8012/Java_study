public class Solution {
//最近父节点
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode (int x) {
			val = x;
		}
	}
	public boolean find(TreeNode root, TreeNode node) {
		if (root == null) {
			return false;
		}
		if (root == node){
			return true;
		}
		if (find(root.left, node))
			return true;
		return find(root.right, node);
	}
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return root;
		}
		boolean pL = false, pR = false, qL = false, qR = false;
		//每一个节点为当前树的跟
		if (root == p || root == q) {
			return root;
		}
		//同一边
		if (find(root.left, p)) {
			pL = true;
			pR = false;
		}else {
			pR = true;
			pL = false;
		}
		if (find(root.left, q)) {
			qL = true;
			qR = false;
		}else{
			qR = true;
			qL = false;
		}
		//同一边
		if (pL && qL) {
			return lowestCommonAncestor(root.left, p, q);
		}else if (pR && qR) {
			return lowestCommonAncestor(root.right, p, q);
		}else{
			//两边
			return root;
		}
	}



	//从前序遍历与中序遍历序列构造二叉树
	TreeNode buildTree(int[] preorder, int[] inorder) {
		return buildTreeHelper(preorder,  inorder, (long)Integer.MAX_VALUE + 1);
	}
	int pre = 0;
	int in = 0;
	private TreeNode buildTreeHelper(int[] preorder, int[] inorder, long stop) {
		//到达末尾返回 null
		if(pre == preorder.length){
			return null;
		}
		//到达停止点返回 null
		//当前停止点已经用了，in 后移
		if (inorder[in] == stop) {
			in++;
			return null;
		}
		int root_val = preorder[pre++];
		TreeNode root = new TreeNode(root_val);
		//左子树的停止点是当前的根节点
		root.left = buildTreeHelper(preorder,  inorder, root_val);
		//右子树的停止点是当前树的停止点
		root.right = buildTreeHelper(preorder, inorder, stop);
		return root;
	}


	//数组移除元素   ①
	public int removeElement(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
	//数组移除元素   ②
	public int RemoveElement(int[] nums, int val) {
		int i = 0;
		int n = nums.length;
		while (i < n) {
			if (nums[i] == val) {
				nums[i] = val;
				n--;
			}else {
				i++;
			}
		}
		return n;
	}



	//两两交换链表中的节点
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	//方法一
	public ListNode SwapPairs(ListNode head) {
		while (head == null || head.next == null) {
			return head;
		}
		ListNode node = new ListNode(-1);
		ListNode res = node;
		while (head != null && head.next != null) {
			node.next = head.next;
			head.next = head.next.next;
			node.next.next = head;

			node = node.next.next;
			head = head.next;

		}
		return res.next;
	}
	//方法二（递归）
	public ListNode swapPairs(ListNode head) {
		while (head == null || head.next == null) {
			return head;
		}
		ListNode node = head.next;
		head.next = swapPairs(node.next);
		node.next = head;
		return node;
	}
}
