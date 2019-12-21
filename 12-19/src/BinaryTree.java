class Node{
	char value;
	Node left;
	Node right;
	public Node(char value) {
		this.value = value;
		left = right = null;
	}
}
public class BinaryTree {
	public static int size = 0;
	public static int leafSize = 0;
	//前序遍历
	public void preOrder(Node root) {
		if (root == null) {
			return;
		}else {
			System.out.println(root.value);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	//中序遍历
	public void inOrder(Node root) {
		if (root == null) {
			return;
		}else {
			inOrder(root.left);
			System.out.println(root.value);
			inOrder(root.right);
		}
	}
	//后序遍历
	public void postOrder(Node root) {
		if (root == null) {
			return;
		}else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.value);
		}
	}
	//统计节点数
	public void getSize1(Node root) {
		if (root != null) {
			getSize1(root.left);
			getSize1(root.right);
			size++;
		}
	}
	public int getSize2(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return getSize2(root.left) + getSize2(root.right) + 1;
	}
	//统计叶子节点
	public void getLeafSize1(Node root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			leafSize++;
			return;
		}
		getLeafSize1(root.left);
		getLeafSize1(root.right);
	}
	public int getLeafSize2(Node root) {
		if (root == null){
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return getLeafSize2(root.left) + getLeafSize2(root.right);
	}
	public Node buildTree(){
		Node root = new Node('A');
		Node node1 = new Node('B');
		Node node2 = new Node('C');
		Node node3 = new Node('D');
		Node node4 = new Node('E');
		Node node5 = new Node('F');
		Node node6 = new Node('G');
		Node node7 = new Node('H');
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		node4.right = node7;
		return root;
	}
	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		Node root = bTree.buildTree();
		bTree.preOrder(root);
		System.out.println();
		bTree.inOrder(root);
		System.out.println();
		bTree.postOrder(root);
		System.out.println();
		bTree.getSize1(root);
		System.out.println(BinaryTree.size);
		System.out.println(bTree.getSize2(root));
		bTree.getLeafSize1(root);
		System.out.println(BinaryTree.leafSize);
		System.out.println(bTree.getLeafSize2(root));
	}
}
