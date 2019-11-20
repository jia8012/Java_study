public class MiddleNode {
    public static Node middleNode (Node head) {
        Node nHead = head;
        int size = 0;

        while (nHead != null) {
            size++;
            nHead = nHead.next;
        }

        nHead = head;
        for (int i = 0; i < size/2; i++) {
            nHead = nHead.next;
        }
        return  nHead;
    }

    public  static void printLinkedList(Node head){
        Node cur = head;

        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Node n4 = new Node(3);
        Node n3 = new Node(7,n4);
        Node n2 = new Node(8,n3);
        Node n1 = new Node(1,n2);
        Node list1 = n1;

        printLinkedList(middleNode(list1));
    }
}
