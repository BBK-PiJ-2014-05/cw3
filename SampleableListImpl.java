public class SampleableListImpl extends ArrayList implements SampleableList {

SampleableList sList;
ReturnObject obj;

public SampleableList sample () {

	sList = new SampleableListImpl();

	int x;

	if (size % 2 == 0) {
		x = size - 1;
	} else {
		x = size;
	}

	int y = (x - 1) / 2;

	for (int i = 0; i <= y; i++) {

		sList.add(listArray[(i * 2) + 1]);

		System.out.print("Sampled list- item at position " + i + ": ");
		sList.get(i);

	}
	System.out.print("Sampled list size: " + sList.size());
	return sList;
}


}