package 接口连同抽象类;

public interface MyList{
    void pushFront(int element);
    void pushBack(int element);
    void insert(int  index, int element);
}

abstract class AbstracList implements MyList {
    protected int size;

    @Override
    public void pushFront(int element) {
        insert(0,element);
    }

    @Override
    public void pushBack(int element) {
        insert(size, element);
    }

}

class MyArrayList extends AbstracList {

    @Override
    public void insert(int index, int element) {

    }

}
class MyLinkedList extends AbstracList {

    @Override
    public void insert(int index, int element) {

    }
}