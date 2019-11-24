package doubly_list;

public class MyLinkedList {
    Node head = null;
    Node last = head;
    int size = 0;
    public void pushFront(int val) {
        Node node = new Node(val);
        node.next = head;
        if(head != null) {
            head.pre = node;
        }
        head = node;

        if (head.next == null) {
            last = head;
        }
        size++;
    }

    public void popFront() {
        if (size == 0) {
            throw new RuntimeException("空了");
        }
        head = head.next;
        if (head != null) {
            head.pre = null;
        }else {
            last = null;
        }
        size--;
    }

    public void pushBack(int val) {
        Node node = new Node(val);
        if (last != null) {
            last.next = node;
        } else {
            head = last;
        }
        node.pre = last;
        last = node;

        size++;
    }

    public void popBack() {
        if (size == 0) {
            throw new RuntimeException("空了");
        }

        if (last.pre != null) {
            last.pre.next = null;
            last = last.pre;
        } else {
            head = last = null;
        }
        size--;
    }

    public void reset() {
        head = last = null;
        size = 0;
    }
    public String toString() {
        String s = "";
        for (Node cur = head; cur != null; cur = cur.next) {
            s += String.format("%d -->", cur.val);
        }
        s += "null";
        return s;
    }
}
