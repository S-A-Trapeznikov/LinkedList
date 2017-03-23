package by.trapeznikov;

public class MyLinkedList<T> {
	
	private Node node;
	private Node first;
	private int size;
	
	public MyLinkedList(){
		this.node = null;
		this.first = null;
		this.size = 0;
	}
	
	public void addInTail(T t){
		
		if (this.first!=null){node = node.getNext();
							  Node next = new Node();
							  node.set(t, next);
		}
			
		if (this.first==null){	Node next = new Node();
								node = new Node(t, next);
								this.first = node;
		}
		size++;
	}
	
	public Object get(){
		return this.node.get();
	}
	
	public Node getFirst(){
		return this.first;
	}
	
	public int size(){
		return this.size;
	}
	
	public void addInHead(T t){
		
		if (this.first!=null){Node headNode = new Node(t,this.first);
							  this.first = headNode;
		}
			
		if (this.first==null){	Node next = new Node();
								node = new Node(t, next);
								this.first = node;
		}
		size++;
	}
	
	public void addInMiddle(T t){
		
		if (this.first!=null){	int numPos = (int) size/2;
								Node node = first;
								Node prevNode = null;
								for(int i=0; i<numPos; i++){
									prevNode = node;
									node = node.getNext();
								}
								Node middleNode =new Node(t,node);
								prevNode.setNext(middleNode);
		}
			
		if (this.first==null){	Node next = new Node();
								node = new Node(t, next);
								this.first = node;
		}
		size++;
	}
	
	public int findIndexElement(T t){
		Node node = first;
		int numPos = 0;
		for (int i=0; i<size;i++){
			if (t==node.get()) numPos=i;
			node = node.getNext();
		}
		return numPos;
		
	}
	
	public Node findElement(int index){
		Node node = first;
		for (int i=0; i<=index-1; i++){
			node = node.getNext();
		}
		return node;
		
	}
	
	public void remove(int index){
		Node node = first;
		Node prevNode = null;
		if (size>=index){
			if (index == 0) {
				first = node.getNext();
			} else if ((index - 1) == size) {
				for (int i = 0; i < index - 1; i++)
					node = node.getNext();
				node.setNext(null);
					} else {
							for (int i = 0; i < index; i++) {
									prevNode = node;
									node = node.getNext();
							}
							prevNode.setNext(node.getNext());
					}
			size--;
		}
	}
	
	public void remove(T t) {
		remove(findIndexElement(t));
		
	}	
}
