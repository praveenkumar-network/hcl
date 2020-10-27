package hcl;

public class RemoveElementFromSingleLinkedList {

	public static void main(String[] args) {

		CustomLinkedList customLinkedList=new CustomLinkedList();
		customLinkedList.addElement(1);
		customLinkedList.addElement(2);
		customLinkedList.addElement(3);
		customLinkedList.addElement(3);
		customLinkedList.addElement(4);
		
		customLinkedList.printData();
		customLinkedList.removeElement(3);
		System.out.println("After Deletion :");
		customLinkedList.printData();

	}

}
