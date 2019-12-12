class Node {
	char val;
	Node left;
	Node right;

	Node(char val) {
		this.val = val;
		left = right = null;
	}
}

public class BinaryTree {
	public static int size = 0;  //静态变量

	public void preOrder(Node root) {
		//终止条件
		if (root == null) {
			return;
		} else {
			System.out.print(root.val + " ");

			preOrder(root.left);

			preOrder(root.right);
		}
		//递推
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		} else {
			inOrder(root.left);

			System.out.print(root.val + " ");

			inOrder(root.right);
		}
	}

	public void postOrder(Node root) {
		if (root == null) {
			return;
		} else {
			inOrder(root.left);

			inOrder(root.right);

			System.out.print(root.val + " ");
		}
	}

	public void getSize1(Node root) {
		if (root == null) {
			return;
		} else {
			getSize1(root.left);

			getSize1(root.right);

			size++;
		}
	}

	public int getSize2(Node root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right  == null) {
			return 1;
		}
		return getSize2(root.left) + getSize2(root.right) + 1;
	}

	int leafSize = 0;
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
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
		return 1;
		}
		return getLeafSize2(root.left) + getLeafSize2(root.right);
	}

	public int getKSize(Node root, int k) {
		if (root == null) {
			return 0;
		}
		if (k == 1) {
			return 1;
		}
		return getKSize(root.left,k - 1) + getKSize(root.right, k - 1);
	}

	public  Node buildTree() {
		Node A = new Node('A');
		Node B = new Node('B');
		Node C = new Node('C');
		Node D = new Node('D');
		Node E = new Node('E');
		Node F = new Node('F');
		Node G = new Node('G');
		Node H = new Node('H');
		A.left = B;
		B.left = D;
		B.right = E;
		E.right = H;
		A.right = C;
		C.left = F;
		C.right = G;
		return A;
	}

	public static void main(String[] args) {
		BinaryTree bTree = new BinaryTree();
		Node tree = bTree.buildTree();
		//   N L R
		bTree.preOrder(tree);
		System.out.println();
		//   L N R
		bTree.inOrder(tree);
		System.out.println();
		//   L R N
		bTree.postOrder(tree);
		System.out.println();

		//计算节点数 方法1
		bTree.getSize1(tree);
		System.out.println(bTree.size);
		//计算节点数 方法2
		System.out.println(bTree.getSize2(tree));

		//计算叶子节点数  方法1
		bTree.getLeafSize1(tree);
		System.out.println(bTree.leafSize);
		//计算叶子节点数  方法2
		System.out.println(bTree.getLeafSize2(tree));

		//计算第K层的节点数
		System.out.println(bTree.getKSize(tree,1));
		System.out.println(bTree.getKSize(tree,2));
		System.out.println(bTree.getKSize(tree,3));
		System.out.println(bTree.getKSize(tree,4));

	}
}
