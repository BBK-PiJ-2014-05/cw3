public class ListTestScript {

/**
* A testbed for all cw3 files
*/



public static void main(String[] args) {
	ListTestScript test = new ListTestScript();
	test.launch();

}

public void launch() {
	List firstTest = new LinkedList();
	ListTest(firstTest);
	List secondTest = new ArrayList();
	//ListTest (secondTest);
	FunctionalList thirdTest = new FunctionalArrayList();
	//FunctionTest(thirdTest);
	FunctionalList fourthTest = new FunctionalLinkedList();
	//FunctionTest(fourthTest);
	SampleableList fifthTest = new SampleableListImpl();
	//SampleTest(fifthTest);

	AbstractStack sixthTest = new StackImpl(secondTest);
	//System.out.println("Testing StackImpl with an ArrayList...");
	//StackFunctions(sixthTest);

	ArrayList improvedStackImplTestStack = new ArrayList();
	//ImprovedStack seventhTest = new ImprovedStackImpl(improvedStackImplTestStack);
	//ImprovedStackFunctions(seventhTest);



}


public void ListTest(List test) {

	ListFunctions(test);
}

public void FunctionTest(FunctionalList test) {

	ListFunctions(test);
	System.out.print("The head is: ");
	test.head();
	System.out.print("and the rest of the list is: ");
	test.rest();

}

public void SampleTest (SampleableList test) {
	System.out.print("Testing SampleableList...");
	ListFunctions(test);
	test.sample();
}


public void ListFunctions(List test) {
	System.out.print("Try to remove an element from an empty list... ");
	test.remove(0);
	System.out.println("Now adding items to the list...");
	test.add("11");
	test.add("22");
	test.add("33");
	test.add("44");
	test.add("55");
	test.add("66");
	System.out.print("Element at position 0: ");
	test.get(0);
	System.out.print("Element at position 1: ");
	test.get(1);
	System.out.print("Element at position 2: ");
	test.get(2);
	test.remove(1);
	System.out.print("after removing the element at pos 1, new element at pos 1 is: ");
	test.get(1);
	System.out.print("Try to remove an item using index > list size...");
	test.get(10);
	System.out.print("Add 77 to index 3...");
	test.add(3,"77");
	System.out.print("index 3 contains...");
	test.get(3);
	System.out.print("and index 4 contains...");
	test.get(4);

}

public void StackFunctions(Stack test) {
	test.push("11");
	test.push("22");
	test.push("33");
	test.push("33");
	test.push("55");
	test.push("66");
	System.out.println("Pushed " + test.size() + " elements to the stack.");
	System.out.print("Element at the top of the stack: ");
	test.top();
	System.out.print("After popping, the top of the stack is: ");
	test.pop();
	test.top();
	System.out.println("...and now there are " + test.size() + " elements on the stack.");


}


public void ImprovedStackFunctions(ImprovedStack test) {
	StackFunctions(test);
	System.out.println("The stack currently contains two instances of 33");
	test.remove("33");
	System.out.println("After removing both instances of 33 the stack size is: " + test.size());
	System.out.print("The bottom of the stack is 11 but after reverse(), 11 is on top: ");
	test.reverse();


}

}