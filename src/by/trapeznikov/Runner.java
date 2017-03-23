package by.trapeznikov;

public class Runner {
	
	public static void main(String [] args){
		
		MyLinkedList<String> a =new MyLinkedList<String>();
		
		a.addInTail("a");
		a.addInTail("b");
		a.addInTail("c");
		a.addInHead("cc");
		a.addInHead("fa");
		a.addInTail("tail");
		a.addInHead("head");
		a.addInMiddle("middle");
		a.addInTail("tail1");
		a.addInHead("head1");
		a.addInMiddle("middle1");
		
		System.out.println(" ");
		
		int size = a.size();
		Node node = a.getFirst();
		for(int i=0; i<size; i++){
			System.out.println(node.get());
			node = node.getNext();
		}
		
		System.out.println(" ");
		
		System.out.println(a.findIndexElement("middle"));
		System.out.println(a.findIndexElement("middle1"));
		System.out.println(a.findElement(2).get());
		
		a.remove(13);
		a.remove("middle1");
		
		System.out.println(" ");
		
		size = a.size();
		node = a.getFirst();
		for(int i=0; i<size; i++){
			System.out.println(node.get());
			node = node.getNext();
		}
		
		System.out.println(" ");
		
		System.out.println(a.findIndexElement("middle"));
		System.out.println(a.findIndexElement("middle1"));
		System.out.println(a.findElement(2).get());
		
		
	}

}
