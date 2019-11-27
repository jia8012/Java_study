public class DeletListVal {
    public static Node deletListVal(Node head, int val) {
        if (head == null) {
            throw new RuntimeException("空的");
        }
        while (head.val == val && head != null) {
            head = head.next;
        }
        Node prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(5);
        Node n3 = new Node(5);
        Node n4 = new Node(1);
        Node n5 = new Node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;
        Node result = deletListVal(head,5);
        while (result != null) {
            System.out.println(result);
            result = result.next;
        }
    }

}
