public class ImprovedStackImpl implements ImprovedStack {

/** an implementation of ImprovedStack using ArrayList as the data structure
*/

private ArrayList internalList;
ReturnObject obj;

public ImprovedStackImpl(ArrayList list) {
	this.internalList = list;
}

/**
* reverses the current stack; checks if stack is empty.
*/

public ImprovedStack reverse() {

	ArrayList newList = new ArrayList();
	ImprovedStack reverseStack = new ImprovedStackImpl(newList);

	if (internalList.isEmpty()) {
		obj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		obj.getError();
		return reverseStack;
	}
	for (int i = 0; i < internalList.size(); i++) {
		reverseStack.push(internalList.listArray[internalList.size()-1 - i]);
	}
	reverseStack.top();
	return reverseStack;
}

/**
* removes all instances of the given value from the stack; checks if empty or null.
*/

public void remove(Object object) {
	if (isEmpty()) {
		obj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		obj.getError();
	}

	if (object == null) {
		obj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);

	} else {

		for (int i = 0; i < internalList.size(); i++) {

			if (internalList.listArray[i].equals(object)) {
				internalList.remove(i);
				i = 0;

			} else {
			}
		}
	}
}

public boolean isEmpty() {
	return internalList.isEmpty();
}

public int size() {
	return internalList.size();
}

public void push(Object item) {
	internalList.add(item);

}

public ReturnObject top() {
	obj = new ReturnObjectImpl(internalList.get(internalList.size()-1));
	return obj;
}

public ReturnObject pop() {

	obj = new ReturnObjectImpl(internalList.listArray[internalList.size()-1]);
	obj.getReturnValue();
	internalList.remove(internalList.size()-1);
	return obj;
}




}