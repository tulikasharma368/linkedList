package linkedList;

public class MyNode<k> implements INode<k> {
	private k key;
	private INode<k> next;
	
	public MyNode(k key) {
		this.key = key;
		this.next = null;
	}
	
	public k getKey() {
		return key;
	}

	public void setKey(k key) {
		this.key = key;
	}

	public INode<k> getNext() {
		return next;
	}

	public void setNext(INode<k> next) {
		this.next = (MyNode<k>)next;
	}
	
	

	

}
