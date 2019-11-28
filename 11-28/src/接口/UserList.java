package 接口;

public class UserList {
    public static MyList selectYiFang() {
        return new MyLinkedList();
    }

    public static void main(String[] args) {
        MyList list = selectYiFang();
        list.pushFront(1);
        list.pushFront(2);
        list.popFront();
    }
}
