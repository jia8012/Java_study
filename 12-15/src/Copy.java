class ListNode{
	int val;
	ListNode next;
	ListNode(){

	}
	ListNode(int val) {
		this.val = val;
	}
}
public class Copy {
	public static ListNode copy (ListNode head) {
		ListNode nHead = null;
		ListNode last = null;
		while (head != null) {
			ListNode node = new ListNode();
			node.val = head.val;
			if (nHead == null) {
				nHead = node;
			} else {
				last.next = node;
			}
			last = node;
			head = head.next;
		}
		return nHead;
	}

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;

		ListNode n5 = new ListNode();
		n5 = copy(n1);
		while (n5 != null) {
			System.out.println(n5.val);
			n5 = n5.next;
		}
	}


}
