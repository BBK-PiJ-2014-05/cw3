public class FunctionalArrayList extends ArrayList implements FunctionalList {


FunctionalList fList;


public ReturnObject head() {

	return get(0);
}

/**
* gets all elements in the list except the head element
*/

public FunctionalList rest(){
	fList = new FunctionalArrayList();
	for (int i = 0; i < size - 1; i++) {
		fList.add(listArray[ 1+ i]);
		System.out.print("item at position "  + i + ": ");
		fList.get(i);

	}
	return fList;
}


}