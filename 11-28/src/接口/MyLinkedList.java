package 接口;

//实现接口

public class MyLinkedList implements MyList {
    private Node head;

    @Override
    public void pushFront(int element) {
        Node node = new Node();
        node.val = element;
        node.next = head;
        head = node;
    }

    @Override
    public void popFront() {
        head = head.next;
    }


}
