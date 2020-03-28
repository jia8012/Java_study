import java.util.Stack;

public class BinaryTree {

	//前序遍历：递归
	public static void prOrder(TreeNode root){
		if (root != null) {
			System.out.print(root.value + " ");
			prOrder(root.left);
			prOrder(root.right);
		}
	}
//前序遍历：非递归
	public static void prOrderNoR(TreeNode root) {
		Stack<TreeNode> st= new Stack<>();
		TreeNode curNode = root;

		while (curNode != null || !st.isEmpty()) {
			while(curNode != null) {
				//走到空时结束
				System.out.print(curNode.value + " ");
				//访问根的左子树
				st.push(curNode);
				curNode = curNode.left;
			}

			//获取栈顶元素
			curNode = st.pop();
			//访问右子树
			curNode = curNode.right;
		}
		System.out.println();
	}


//中序遍历：递归
	public static void inOrder(TreeNode root){
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.value + " ");
			inOrder(root.right);
		}
	}
//中序遍历：非递归
	public static void inOrderNoR(TreeNode root) {
		Stack<TreeNode> st = new Stack<>();
		TreeNode curNode = root;

		while (curNode != null || !st.isEmpty()) {
			while (curNode != null) {
				//走到空时结束
				st.push(curNode);
				//访问根的左子树
				curNode = curNode.left;
			}
			//获取栈顶元素
			curNode = st.pop();
			//打印栈顶元素
			System.out.print(curNode.value + " ");
			//访问右子树
			curNode = curNode.right;
		}
		System.out.println();
	}

//后序遍历：递归
	public static void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.value + " ");
		}
	}
//后序遍历：非递归
	public static void postOrderNoR(TreeNode root) {
		Stack<TreeNode> st = new Stack<>();
		TreeNode curNode = root;
		TreeNode prev = null;

		while (curNode != null || !st.isEmpty()) {
			while (curNode != null) {
				//走到空时结束
				st.push(curNode);
				//访问根的左子树
				curNode = curNode.left;
			}
			//获取栈顶元素
			//
			curNode = st.peek();
			if (curNode.right == null || curNode.right == prev) {
				System.out.print(curNode.value + " ");
				prev = curNode;
				st.pop();
				curNode = null;
			} else {
				//访问右子树
				curNode = curNode.right;
			}

		}
		System.out.println();
	}

	public static TreeNode buildTree(){
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		root.left = left;
		root.right = right;
		left.left = node4;
		left.right = node5;
		right.left = node6;
		right.right = node7;
		left.left.left = node8;
		return root;
	}

	public static void main(String[] args) {
		TreeNode root = buildTree();
		System.out.println("前序遍历：递归");
		prOrder(root);
		System.out.println();
		System.out.println("前序遍历：非递归");
		prOrderNoR(root);

		System.out.println("中序遍历：递归");
		inOrder(root);
		System.out.println();
		System.out.println("中序遍历：非递归");
		inOrderNoR(root);

		System.out.println("后序遍历：递归");
		postOrder(root);
		System.out.println();
		System.out.println("后序遍历：非递归");
		postOrderNoR(root);
	}
}
