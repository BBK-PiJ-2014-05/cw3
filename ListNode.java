public class ListNode {

private Object content;
private ListNode next;


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
