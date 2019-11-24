public class Main {
    public static void testCopyList () {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
    }

    public static void main(String[] args) {
        RNode n1 = new RNode(1);
        RNode n2 = new RNode(2);
        RNode n3 = new RNode(3);
        RNode n4 = new RNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next =n4;

        n1.random = n2;
        n2.random = n1;
        n3.random = n3;

        RNode nHead = CopyRList.copy(n1);
        System.out.println("hello");
    }
}
