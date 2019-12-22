
class Node {
	Node left;
	Node right;
	char value;
	Node (char value) {
		this.value = value;
	}
}

//查找value 在不在root为根的树内
public class BinaryTree {
	public Node find(Node root, int value) {
		if (root == null)
			return root;
		if (root.value == value)
			return root;
		Node node = find(root.left, value);
		if(node != null) {
			return node;
		}
		return find(root.right, value);
	}


	//建树
	//A B C # # D E # G # # f # # #
	static int i = 0;
	Node build (String s) {
		if (s.charAt(i) != '#') {
			Node root = new Node(s.charAt(i));
			i++;
			root.left = build(s);
			i++;
			root.right = build(s);
			return root;
		}
		return null;
	}
}
