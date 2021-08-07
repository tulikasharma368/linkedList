package linkedList;

public interface INode <k> {
	k getKey();
	void setKey(k Key);
	
	INode<k> getNext();
	void setNext(INode<k> getNext);
}
