public class Test {
    public static Node reverseList (Node head) {
        Node nHead = null;
        Node cur = head;

        while (cur != null) {
            Node next = cur.next;
            cur.next = nHead;
            nHead = cur;
            cur = next;
        }
        return nHead;
    }

    public  static void printLinkedList(Node head){
        Node cur = head;

        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Node n3 = new Node(3,null);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        Node head = n1;

        Node result = reverseList(head);
        printLinkedList(result);

    }

}
