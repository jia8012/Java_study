import java.util.Stack;

class Node {
	int val = 0;
	Node left = null;
	Node right = null;
	public Node(int val) {
		this.val = val;
	}
}

public class Solution {
	public static void preOrderNor(Node root){
		Stack<Node> st = new Stack<>();
		Node curNode = root;
		while (curNode != null || !st.isEmpty()){
			while (curNode != null){
				st.push(curNode);
				curNode = curNode.left;
			}
			curNode = st.pop();
			System.out.print(curNode.val + " ");
			curNode = curNode.right;

		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.right.left = new Node(6);
		root.right.right = new Node(7);

		preOrderNor(root);
	}


}
