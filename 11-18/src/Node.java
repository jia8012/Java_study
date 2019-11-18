public class Node {
    //两个属性
    int val;     //数字
    Node next;   //下一个引用

    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }

    Node(int val){
        this (val, null);
    }

    @Override
    public String toString(){
        return String.format("Node{%d}",val);
    }
}
