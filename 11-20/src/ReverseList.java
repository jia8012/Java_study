public class ReverseList {

    public static void printLinkedList(Node head){
        Node cur = head;

        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    public static Node buildList(){
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        return n1;
    }
    public static void main(String[] args) {


        Node head = buildList();

        printLinkedList(head);

    }
}
