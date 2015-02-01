public class ListNode {

private Object content;
private ListNode next;

/**
* ListNode class used in LinkedList
*/


	public ListNode(Object content) {
		this.content = content;
		this.next = null;
	}

	public void setNext(ListNode node) {
		next = node;
	}

	public ListNode getNext() {
		return next;
	}

	public Object getContent() {
		return content;
	}


}
