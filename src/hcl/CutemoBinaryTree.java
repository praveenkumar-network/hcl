package hcl;

public class CutemoBinaryTree {

	Node head;;
	void inOrderTraverser(int element){
		inOrderTraverserRecursiverly(head,element);
		
	}
	
void inOrderTraverserRecursiverly(Node current,int element){
		if(current!=null) {
			inOrderTraverserRecursiverly(current.left,element);
			System.out.println(current.getData());
			inOrderTraverserRecursiverly(current.right,element);
		}
	}
}
