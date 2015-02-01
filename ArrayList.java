public class ArrayList implements List {

protected Object[] listArray;
protected int size;
protected static int INITIAL_SIZE = 5;
private ReturnObject obj;

	public ArrayList() {
		listArray = new Object[INITIAL_SIZE];
		size = 0;
	}

	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return size;
	}
/**
* returns the object at the specified position
*/

	public ReturnObject get(int index) {
		if (isEmpty()) {
			obj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			obj.getError();
			return obj;
		} else if (index < 0 || index >= size) {
			obj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			obj.getError();
			return obj;
		} else {
			obj = new ReturnObjectImpl(listArray[index]);
			System.out.println("" + obj.getReturnValue());
			return obj;
		}
/**
* adds an item to the end of the list
*/

	}

	public ReturnObject add(Object item) {
		if (item == null) {
			obj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			obj.getError();
			return obj;
		}
		if (isAlmostFull()) {
			reserveMoreMemory();
		}
		listArray[size] = item;
		size++;
		obj = new ReturnObjectImpl(item);
		obj.getReturnValue();
		return obj;

	}
/**
* adds an object to a specified position in the list
*
*/

	public ReturnObject add(int index, Object item) {
		if (index < 0 || index > size) {
			obj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			obj.getError();
			return obj;
		}
		if (item == null) {
			obj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			obj.getError();
			return obj;
		}

		if (isAlmostFull()) {
			reserveMoreMemory();
		}

		if (index == size) {
			add(item);
			return null;
		}

		for (int i = 0; i < size - index; i++) {
			listArray[size - i] = listArray[size - 1 - i];
			}

			listArray[index] = item;
			size++;
			obj = new ReturnObjectImpl(item);
			obj.getReturnValue();
		return obj;

	}



/**
* removes an item; if the item to be removed is the last item in the list then the correspinding list reference becomes null.
*/

	public ReturnObject remove(int index) {
		if (isEmpty()) {
			obj = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			obj.getError();
			return obj;
		} else if (index < 0 || index >= size) {
			obj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			obj.getError();
			return obj;
		} else {
			size--;
			if (index == size) {
				listArray[index] = null;
			} else {

				for (int i = 0; i < size - index; i++) {
					listArray[index + i] = listArray[index + i + 1];
				}
			}
			obj = new ReturnObjectImpl(listArray[index]);

			return obj;
		}
	}

/**
* checks if there is a space in the array
*/

	private boolean isAlmostFull() {
		if(listArray.length - size < 1) {
			return true;
		} else {
			return false;
		}
	}
/**
* makes a new array twice the size of the current one
*/

	private void reserveMoreMemory() {
		Object[] biggerArray = new Object[size * 2];
			for (int i = 0; i < listArray.length; i++) {
				biggerArray[i] = listArray[i];
			}
			listArray = biggerArray;
		}







}

