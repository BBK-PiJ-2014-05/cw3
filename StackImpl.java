public class StackImpl extends AbstractStack {

ReturnObject obj;



public StackImpl(List list) {
	super(list);
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

	 return obj = new ReturnObjectImpl(internalList.get(0));

}

public ReturnObject pop() {

     return obj = new ReturnObjectImpl(internalList.remove(0));


}



}