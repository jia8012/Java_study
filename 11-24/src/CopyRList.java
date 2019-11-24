public class CopyRList {
    public static RNode copy (RNode head) {
        if (head == null) {
            return null;
        }

        RNode cur;
        cur = head;
        while (cur != null) {
            RNode node = new RNode();
            node.val = cur.val;

            node.next = cur.next;
            cur.next = node;

            cur = node.next;
        }

        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        cur = head;
        RNode nHead = head.next;
        while (cur != null) {
            RNode node = cur.next;
            cur.next = node.next;
            if (node.next != null) {
                node.next = node.next.next;
            }
            cur = cur.next;
        }
        return nHead;


    }
}
