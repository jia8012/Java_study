public class MyLinkedList{
	public stat Node buildLinkedListHand(){
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		retuen n1;
	}
	public static void printLinkedList(Node head){
		Node cur = head;
		
		while(cur != null){
			System.out.println(cur.val);
			cur = cur.next;
		}
	}
	
	public static Node pushFront(Node head, int val){
		Node node = new Node(val);
		node.next = head;
		return node;
	}
	
	public static Node popFront(Node head){
		if(head == null){
			throw new RunTimeException("空链表");
		}
		return head.next;
	}
	
	public static void main(String[] args){
		// Node node = buildLinkedListHand();
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












