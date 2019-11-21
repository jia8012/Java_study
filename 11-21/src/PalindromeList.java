public class PalindromeList {

    public static int getLength (Node head) {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    public static Node getMinddle (Node head) {  //中间节点
        int length = getLength(head);
        int half = length/2;
        Node cur = head;
        for (int i = 0; i < half; i++) {
            cur = cur.next;
        }

        return cur;
    }

    public static Node reverseList(Node head) {
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

    public static boolean chkPalindrome (Node A) {
        Node middle = getMinddle(A);
        Node rhead = reverseList(middle);
        Node c1 = A;
        Node c2 = rhead;

        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return  false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node n5 = new Node(1);
        Node n4 = new Node(2,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        Node A = n1;

        boolean result = chkPalindrome(A);
        System.out.println(result);

    }

}
