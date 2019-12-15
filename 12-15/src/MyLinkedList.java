class MyLinkedList {
	//创建节点对象
	private class Node{
		private int val;
		private Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	//定义头结点  定义节点数量
	private Node head;
	private int size;

	//创建头结点，初始化节点数量为零
	/** Initialize your data structure here. */
	public MyLinkedList() {
		head = new Node(-1);
		size = 0;
	}

	//获取链表下标为index的元素
	/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	public int get(int index) {
		//下标小于0或者下标大于链表元素数量，直接返回-1
		if(index < 0 || index >= size) {
			return -1;
		}
		//创建一个新节点，起始位值为head的next
		Node curr = head.next;
		for(int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.val;
	}

	//头插，相当于在0下标插入
	/** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	public void addAtHead(int val) {
		addAtIndex(0,val);
	}

	//尾插，相当于在最以后一个下标(size)下标插入
	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		addAtIndex(size,val);
	}

	//在链表下标为index的位置添加值为val的节点
	/** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	public void addAtIndex(int index, int val) {
		if(index > size) {
			return;
		}
		if(index < 0) {
			addAtHead(val);
		}
		Node prev = head;
		for(int i = 0; i < index; i++) {
			prev = prev.next;
		}
		Node node = new Node(val);
		node.next = prev.next;
		prev.next = node;
		size++;
	}

	//删除链表中下标为index的节点
	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if(index < 0 || index >= size) {
			return;
		}
		Node prev = head;
		for(int i = 0; i < index; i++) {
			prev = prev.next;
		}
		prev.next = prev.next.next;
		size--;
	}

	public static void main(String[] args) {
		MyLinkedList a = new MyLinkedList();
		a.addAtHead(1);
		a.addAtTail(3);
		a.addAtIndex(1,2);
		System.out.println(a.get(1));
		a.deleteAtIndex(1);
		System.out.println(a.get(1));
	}
}














