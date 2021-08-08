package linkedList;

public class AddNew<k> {
	INode<k> head;
	INode<k> tail;
	
	public AddNew() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode<k> newNode) {
		if(this.head==null)
			this.head=newNode;
		if(this.tail==null)
			this.tail=newNode;
		else {
			INode<k> tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode<k> newNode) {
		if(this.head==null)
			this.head=newNode;
		if(this.tail==null)
			this.tail=newNode;
		else {
			this.tail.setNext(newNode);
			this.tail=newNode;
			
		}
	}
	
	public void insert(INode<k> myNode, INode<k> newNode) {
		INode<k> temp=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(temp);
	}
	
	public  void pop() {
		INode<k> temp = this.head;
		this.head=head.getNext();
		System.out.println("Popped element: "+temp.getKey());
	}
	
	public void popLast() {
		INode temp = this.tail;
		INode tempNode = head; // TODO Auto-generated method stub
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tail.setNext(null);
		System.out.println("Popped element: " + temp.getKey());
	}
	
	
	public void print() {
		StringBuffer myNodes = new StringBuffer("My Nodes are : ");
		INode<k> tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	
	
}
