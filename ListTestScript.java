public class ListTestScript {

public static void main(String[] args) {

	LinkedList link = new LinkedList();
	link.add("33");
	link.add("22");
	link.add("11");
	link.add("90");
	link.add("78");

	System.out.println("size is: " + link.size());
	System.out.print("link.get(1) ");
	link.get(1);
	link.remove(1);

	link.get(0);
	link.get(1);
	link.get(2);
	link.get(3);
	link.add(2,"34");
	System.out.println("size is: " + link.size());
	link.get(0);
	link.get(1);
	link.get(2);
	link.get(3);
	link.get(4);
	//link.get(5);

	FunctionalList flist = new FunctionalArrayList();
	flist.add("8766");
	flist.add("44");
	flist.get(0);




}
}