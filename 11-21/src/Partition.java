public class Partition {

    public static Node partition (Node head, int x) {
        Node cur = head;
        Node sHead = null;
        Node sLast = null;
        Node bHead = null;
        Node bLast = null;

        while (cur != null) {
            if (cur.val < x) {
                if (sHead == null) {
                    sHead = cur;
                } else {
                    sLast.next = cur;
                }
                sLast = cur;
            } else {
                if (bHead == null) {
                    bHead = cur;
                } else {
                    bLast.next = cur;
                }
                bLast = cur;
            }
            cur = cur.next;
        }

        if(sHead == null) {
            return bHead;
        }

        if (bHead == null) {
            return sHead;
        }

        sLast.next = bHead;
        bLast.next = null;
        return sHead;
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

        Node result = partition(list1,6);
        printLinkedList(result);

    }
}
