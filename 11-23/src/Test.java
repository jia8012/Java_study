public class Test {
    public static Node reverseList (Node head) {
        Node nhead = null;
        Node cur = head;
        while (cur != null) {
            Node tmpNext = cur.next;
            cur.next = nhead;
            nhead = cur;
            cur = tmpNext;
        }
        return nhead;
    }

    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        Node head = n1;

        Node result = reverseList(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
