package linkedList;

public class MyLinkedList {
	
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		AddNew addNew = new AddNew();
		addNew.add(myFirstNode);
		addNew.append(myThirdNode);
		addNew.insert(myFirstNode, mySecondNode);
		System.out.println("List before popping last");
		addNew.print();
		addNew.popLast();
		System.out.println("List after popping last");
		addNew.print();		
	}
	
}
