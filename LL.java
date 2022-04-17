 class LL {
	 Node head;
	 private int size;
	 LL(){
		 size=0;
	 }
	 public class Node{
		 String data;
		 Node next;
		 Node(String data){
			 this.data=data;
			 this.next=null;
			 size++;
		 }
	 }
	 public void addFirst(String data) {  // to add first in linked list this is from beggineer to implement from LL.
		Node newNode =new Node(data);
		newNode.next=head;
		head=newNode;
	 }
	 public void addLast(String data) {
		 Node newNode=new Node(data);
		if(head == null) {
			head =newNode;
			return;
				}
		 Node lastNode =head;
		 while(lastNode.next !=null) {
			 lastNode =lastNode.next;
			 
		 }
		lastNode.next =newNode;
	 }
	 public void printlist() {
		 Node currNode =head;
		 while(currNode !=null) {
			 System.out.println(currNode.data+"->");
			 currNode =currNode.next;
		 }
		 System.out.println("null");
	 }
	 public void removeFirst() {
		 if(head==null) {
			 System.out.println("Empty element no element to delete.");
			 return;
		 }
		 head=this.head.next;
		 size--;
	 }
	 public void removeLast() {
		 if(head==null) {
			 System.out.println("Empty element no element to delete..");
			 return;
		 }
		 size--;
		 if(head.next==null) {
			 head=null;
			 return;
		 }
		 Node currNode =head;
		 Node lastNode =head.next;
		 while(lastNode.next !=null) {
			 currNode=currNode.next;
			 lastNode=lastNode.next;
		 }
		 currNode.next=null;	 
	 }
	 public int  getsize() {
		 return size;
	 }
	 public static void main(String args[]) {
		 LL list =new LL();
		 list.addLast("is");
		 list.addLast("a");
		 list.addLast("this");
		 list.printlist();
		 list.addFirst("this");
		 list.printlist();
		 System.out.println(list.getsize());
		 list.removeFirst();
		 list.printlist();
		 list.removeLast();
		 list.printlist(); 
	 }

}
