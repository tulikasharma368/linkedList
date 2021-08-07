package linkedList;

public class MyLinkedList {
	
	public void data() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
	}
	public static void main(String[] args) {
		MyLinkedList mll = new MyLinkedList();
		mll.data();
	}
	
}
