public class FunctionalLinkedList extends LinkedList implements FunctionalList {

FunctionalList fList;


public ReturnObject head() {
	return get(0);

}

/**
* implementation of functionalList using a linkedList
*/

public FunctionalList rest() {
	ListNode currentNode = head;

	ReturnObject fObj;
	fList = new FunctionalLinkedList();
	for (int i = 0; i < size(); i++) {
		if (currentNode.getNext() == null) {
			return null;
		}
		fList.add(currentNode.getNext());
		currentNode = currentNode.getNext();


		fObj = new ReturnObjectImpl(currentNode.getContent());
		System.out.println("" + fObj.getReturnValue());


	}

	return fList;

}




}