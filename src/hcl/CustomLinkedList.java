package hcl;

public class CustomLinkedList {

	Node head;
	
	public void printData() {
		
		Node temp=head;
		while(temp!=null) {
			System.out.println("Data of linkedlist :"+temp.getData());
			temp=temp.next;
		}
		
	}
	
	public void addElement(int element) {
	
		if(head==null) {
			Node node=new Node(element);	
			head=node;
		}else {
				  Node node=new Node(element);
				  Node temp=head; 
				  while(temp.next!=null) {
				  temp=temp.next; 
				  } 
				  temp.next=node;
		}
	}
	
	public void removeElement(int element) {
		int count=0;
		Node temp=head;
		Node previousPointer=null;
		while(temp.next!=null) {
			if(temp.getData()==element) {
				if(count>0) {
					previousPointer.next=temp.next;
					System.out.println("Deleted element "+temp.getData());
					temp=temp.next;
					count++;
				}else {
					previousPointer=temp;
					temp=temp.next; 
					count++;
				}
			}else{
				temp=temp.next; 
			}
			  
			  } 
		 
	}
	
}
