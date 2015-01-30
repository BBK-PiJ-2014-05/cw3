public class ListTestScript {

public static void main(String[] args) {
	ListTestScript test = new ListTestScript();
	test.launch();

}

public void launch() {
	List firstTest = new LinkedList();
	//TestCase1(firstTest);
	List secondTest = new ArrayList();
	//TestCase1 (secondTest);
	FunctionalList thirdTest = new FunctionalArrayList();
	TestCase2(thirdTest);
	FunctionalList fourthTest = new FunctionalLinkedList();
	TestCase2(fourthTest);


}


public void TestCase1(List test) {

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

public void TestCase2(FunctionalList test) {

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
	test.head();
	//test.rest();

}




}