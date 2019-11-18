import sun.awt.geom.AreaOp;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyLinkedList {
    public static Node buildLinkedListHand(){
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



    public static void printLinkedList(Node head){
        Node cur = head;

        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static Node pushFront(Node head, int val) {
        Node node = new Node(val);
        node.next = head;
        return node;
    }

    public static Node popBack(Node head){
        if(head == null){
            throw new RuntimeException("空的");
        }
        if(head.next == null){
            return null;
        }else{
            Node cur = head;
            while (cur.next.next != null){
                cur = cur.next;
            }
            cur.next = null;
            return head;
        }
    }

    public static Node pushBack(Node head,int val){
        Node node = new Node(val);
        if(head == null){
            //链表中没有节点
            return node;
        }else{
            Node cur = head;
            while(cur.next  != null){
                cur = cur.next;
            }
            cur.next = node;
        }

        return head;
    }

    public static Node popFront(Node head){
        if(head == null){
            throw new RuntimeException("空链表");
        }
        return head.next;
    }

    public static void main(String[] args){
        // Node node = buildLinkedListHand();
        Node head = null;
        head = pushFront(head,0);
        head = pushFront(head,1);
        head = pushFront(head,2);
        head = pushFront(head,3);    //头添
        head = pushFront(head,4);
        printLinkedList(head);
        System.out.println("----------------------------------");

        head = popFront(head);   //头删
        head = popFront(head);
        printLinkedList(head);
        System.out.println("----------------------------------");

        head = popBack(head);    //尾删
        head = popBack(head);
        printLinkedList(head);
        System.out.println("----------------------------------");

        head = pushBack(head,10);   //中间添加
        printLinkedList(head);
    }
}
