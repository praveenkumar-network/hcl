package hcl;

public class Node {
	 int data;

	Node next;
	Node right;
	Node left;
	
	public Node() {
	}
	public Node(int data) {
		this.data=data;
	}
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
