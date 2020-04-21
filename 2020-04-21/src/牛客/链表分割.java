package 牛客;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class 链表分割 {
	public ListNode partition(ListNode pHead, int x) {
		ListNode head1 = null;
		ListNode last1 = null;
		ListNode head2 = null;
		ListNode last2 = null;
		while (pHead != null) {
			if(pHead.val < x) {
				if(head1 == null) {
					ListNode node = new ListNode(pHead.val);
					head1 = node;
					last1 = node;
				} else {
					ListNode node = new ListNode(pHead.val);
					last1.next = node;
					last1 = node;
				}
				pHead = pHead.next;
			}

			if (pHead == null) break;
			if(pHead.val >= x) {
				if(head2 == null) {
					ListNode node = new ListNode(pHead.val);
					head2 = node;
					last2 = node;
				} else {
					ListNode node = new ListNode(pHead.val);
					last2.next = node;
					last2 = node;
				}
				pHead = pHead.next;
			}
		}

		if (head1 == null) return head2;
		if (head2 == null) return head1;
		last1.next = head2;
		return head1;
	}
}