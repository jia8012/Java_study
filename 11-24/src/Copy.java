public class Copy {
    public static Node copy (Node head) {
        Node cur = head;
        Node nhead = null;
        Node last = nhead;
        while (cur != null) {
            Node tmp = new Node(cur.val);
            if (nhead == null) {
                nhead = tmp;
            } else {
                last.next = tmp;
                last = tmp;
            }
            cur = cur.next;
        }
        return nhead;
    }
}
