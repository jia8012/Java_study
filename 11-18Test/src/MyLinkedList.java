public class MyLinkedList {
    public static Node buildLinkedListhand() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        // 1 2 3 4 5
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        return n1;
    }

    public static void printLinkedList(Node head){ //打印
        Node cur = head;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static Node pushFront(Node head,int val){  //头插
        Node node = new Node(val);
        node.next = head;
        return node;
    }

    public static Node popFront(Node head){  //头删
        if(head == null){
            throw new RuntimeException("空链表");
        }
        return head.next;
    }

    public static void main(String[] args) {
        //Node head = buildLinkedListhand();
        //按序打印每一个值
        //如何遍历链表
        //printLinkedList(head);
        Node head = null;
        head = pushFront(head,0);
        head = pushFront(head,1);
        head = pushFront(head,2);
        head = pushFront(head,3);
        head = pushFront(head,4);
        printLinkedList(head);

        head = popFront(head);
        head = popFront(head);
        printLinkedList(head);
    }
}
