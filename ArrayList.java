public class ArrayList implements List {

	private Object[] listArray;
	private static int INITIAL_SIZE = 5;
	private int size;
	private ReturnObjectImpl obj;
/**
* 	constructs a new ArrayList of the INITIAL_SIZE (5)
*/

	public ArrayList() {
		listArray = new ArrayList[INITIAL_SIZE];
		size = 0;
	}

/**
*	checks if the ArrayList is empty
*	@Return true or false
*/
	public boolean isEmpty() {
		if (listArray == null) {
			return true;
		} else {
			return false;
		}
	}
/**
*	return the size of the array
*	@Return int size
*/

	public int size() {
		return size;
	}

/**
*
*/

	public ReturnObject get(int index) {
		if (index > size) {
			return obj = new ReturnObjectImpl(ErrorMessage.OUT_OF_BOUNDS);
		} else {
			return obj = new ReturnObjectImpl(listArray[index]);

		}

	}

	public ReturnObject remove(int index) {
		return obj = new ReturnObjectImpl(listArray[index]);

	}

	public ReturnObject add(int index, Object item) {
		if (index > size || index < 0 ) {
		return obj = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);

		}
		if (item == null) {
		return obj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else if (isAlmostFull()) {
				reserveMoreMemory();
			} else {
				Object[] tempArray = new ArrayList[size-index];
				for (int i = 0; i < size-index; i++) {
						tempArray[i] = listArray[i+index];
					}
					obj = new ReturnObjectImpl(item);
					size++;
					listArray[index] = obj;
						for (int i = 0; i < size-index; i++) {
							listArray[index + 1 + i] = tempArray[i];
						}
					}


	}

	public ReturnObject add(Object item) {
		if (isAlmostFull()) {
			reserveMoreMemory();
		}
		if (item == null) {
			obj = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
		} else {
			listArray[size] = new ReturnObjectImpl(item);
			size++;
		}
	}





	private boolean isAlmostFull() {
		if (listArray.length - size < 1) {
			reserveMoreMemory();
			return true;
		} else {
			return false;
		}
	}

	private void reserveMoreMemory() {
		Object[] biggerArray = new ArrayList[size * 2];
		for (int i = 0; i < listArray.length; i++) {
			biggerArray[i] = this.listArray[i];
		}
		this.listArray = biggerArray;
	}

}