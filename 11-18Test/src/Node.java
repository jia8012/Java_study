public class Node {  //节点
    int val;
    Node next;
    Node(int val, Node next){
        this.val = val;
        this.next = next;
    }
    Node(int val){
        this(val,null);
    }

    //@Override
    //public String toString(){
    //    return String.format("Node{%d}", val);
    //}
}
