package linkedList;

public class MyLinkedList {
	
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		AddNew addNew = new AddNew();
		addNew.add(myFirstNode);
		addNew.add(mySecondNode);
		addNew.add(myThirdNode);
		addNew.print();
	}
	
}
