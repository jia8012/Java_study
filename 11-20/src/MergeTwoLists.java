public class MergeTwoLists {
    public static Node mergeTwoLists(Node list1, Node list2){
        if(list1 == null){
            return list2;
        }

        if (list2 == null){
            return list1;
        }

        Node cur1 = list1;
        Node cur2 = list2;

        Node nhead = null;
        Node nLast = null;

        while (cur1 != null && cur2 != null){
            if (cur1.val <= cur2.val){
                if(nhead == null){
                    nhead = cur1;
                } else {
                    nLast.next = cur1;
                }
                nLast = cur1;   //更新尾节点
                cur1 = cur1.next;
            } else {
                if(nhead == null){
                    nhead = cur2;
                } else {
                    nLast = cur2;
                }
                nLast= cur2;
                cur2 = cur2.next;
            }
        }

        if(cur1 == null){
            nLast.next = cur2;
        } else {
            nLast.next = cur1;
        }
        return nhead;
    }

    public static void printLinkedList(Node head){
        Node cur = head;

        while(cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    public static void main(String[] args) {
        Node n5 = new Node(5);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        Node list1 = n1;

        Node m3 = new Node(13);
        Node m2 = new Node(7,m3);
        Node m1 = new Node(0,m2);
        Node list2 = m1;

        Node resule = mergeTwoLists(list1,list2);
        printLinkedList(resule);
    }
}
