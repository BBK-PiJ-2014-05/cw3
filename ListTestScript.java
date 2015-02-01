public class ListTestScript {

public static void main(String[] args) {
	ListTestScript test = new ListTestScript();
	test.launch();

}

public void launch() {
	List firstTest = new LinkedList();
	//ListTest(firstTest);
	List secondTest = new ArrayList();
	//ListTest (secondTest);
	FunctionalList thirdTest = new FunctionalArrayList();
	//FunctionTest(thirdTest);
	FunctionalList fourthTest = new FunctionalLinkedList();
	//FunctionTest(fourthTest);
	SampleableList fifthTest = new SampleableListImpl();
	//SampleTest(fifthTest);

	AbstractStack sixthTest = new StackImpl(secondTest);
	StackFunctions(sixthTest);


}


public void ListTest(List test) {

	ListFunctions(test);
}

public void FunctionTest(FunctionalList test) {

	ListFunctions(test);
	System.out.print(" head is ");
	test.head();
	test.rest();

}

public void SampleTest (SampleableList test) {
	ListFunctions(test);
	test.sample();
}


public void ListFunctions(List test) {

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

}

public void StackFunctions(AbstractStack test) {
	test.push("11");
	test.push("22");
	test.push("33");
	test.push("44");
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

}