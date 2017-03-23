package by.trapeznikov;

public class Node {
	
	private Object e;
	private Node next;
	
	public Node(){}
	
	public Node(Object e, Node next){
		this.e = e;
		this.next = next;
	}
		
	public Object get(){
		return this.e;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void set(Object e, Node next){
		this.e = e;
		this.next = next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	
//	public String toString(){
//		Object s = this.e;
//		return s;
//	}
}
