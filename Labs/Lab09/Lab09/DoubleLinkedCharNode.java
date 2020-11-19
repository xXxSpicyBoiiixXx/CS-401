
public class DoubleLinkedCharNode {
	private char info;
	private DoubleLinkedCharNode previous;
	private DoubleLinkedCharNode next;
	
	public DoubleLinkedCharNode(char info) {
		this.info = info;
		this.previous = null;
		this.next = null;
	}
	
	public DoubleLinkedCharNode(char info, DoubleLinkedCharNode previous, DoubleLinkedCharNode next) {
		this.info = info;
		this.previous = previous;
		this.next = next;
	}
	
	public char getInfo() {
		return info;
	}
	public void setInfo(char info) {
		this.info = info;
	}
	public DoubleLinkedCharNode getNext() {
		return next;
	}
	public void setNext(DoubleLinkedCharNode next) {
		this.next = next;
	}
	public DoubleLinkedCharNode getPrevious() {
		return previous;
	}
	public void setPrevious(DoubleLinkedCharNode previous) {
		this.previous = previous;
	}
}
