public class FunctionalArrayList extends ArrayList implements FunctionalList {

private Object[] fListArray;
private ReturnObject obj;
private FunctionalList fList;
private int fListSize;

public FunctionalArrayList() {
	fListArray = new Object[INITIAL_SIZE];
	size = 0;
}



public ReturnObject head() {
	return obj = get(0);
}

public FunctionalList rest(){
	fList = new FunctionalArrayList();
	Object[] restList = new Object[size];
	for (int i =0; i < size; i++) {
		restList[i] = fListArray[i];
		System.out.print("" + restList[i]);
	}
	return fList;
}


}