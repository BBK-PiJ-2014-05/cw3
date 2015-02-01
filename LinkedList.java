public class LinkedList implements List {

protected ListNode head;
protected ReturnObject obj;

/**
* implementation of list using LinkedList structure
*/


	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		int result = 0;
		ListNode currentNode = head;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			result++;
		}
		return result;
	}

	public ReturnObject add(Object item) {
		if (item == null) {
			obj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return obj;
		}
		ListNode node = new ListNode(item);
		if (head != null) {
			node.setNext(head);
		}
		head = node;
		obj = new ReturnObjectImpl(item);
		return obj;
	}

	public ReturnObject get(int index) {
		if (isEmpty()) {
			obj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			obj.getError();
			return obj;
		}
		if (index < 0 || index >= size()) {
			obj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			obj.getError();
			return obj;
		}

		ListNode currentNode = head;

		for (int i = 0; i < index ; i++) {
			if (currentNode.getNext() == null) {
				return null;
				}

				currentNode = currentNode.getNext();

			}
			obj = new ReturnObjectImpl(currentNode.getContent());
			System.out.println("" + obj.getReturnValue());
			return obj;
		}

		public ReturnObject remove(int index) {
			if (isEmpty()) {
				obj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
				obj.getError();
				return obj;
			}
			if (index < 0 || index >= size()) {
				obj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
				obj.getError();
				return obj;
			}
			ListNode currentNode = head;

			for (int i = 1; i < index; i++) {
				if (currentNode.getNext() == null) {
					return null;
				}
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());
			obj = new ReturnObjectImpl(currentNode.getNext());
			return obj;
		}

		public ReturnObject add(int index, Object item) {

			if (index < 0 || index > size()) {
				obj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
				obj.getError();
				return obj;
			}
			if (item == null) {
				obj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
				obj.getError();
				return obj;
			}
			ListNode currentNode = head;

			for (int i = 1; i < index; i++) {
				if (currentNode.getNext() == null) {
					return null;
				}
				currentNode = currentNode.getNext();
			}
				ListNode node = new ListNode(item);
				node.setNext(currentNode.getNext());
				currentNode.setNext(node);
				obj = new ReturnObjectImpl(node.getContent());
				return obj;
		}





}
