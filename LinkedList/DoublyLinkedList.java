package LinkedList;
import java.util.Scanner;

class DNode{
	int data;
	DNode next=null;
	DNode prev=null;

	DNode(int data){
		this.data=data;
	}
}

class DLinkedList{
	DNode head=null;

	void addFirst(int data) {
		DNode newNode = new DNode(data);

		if(head==null) {
			head=newNode;			
		}else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}

	void addLast(int data) {
		DNode newNode = new DNode(data);

		if(head==null) {
			head=newNode;
		}else {
			DNode temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
	}

	void addAtPos(int pos,int data) {
		if(pos>countNode()+1 || pos<=0) {
			System.out.println("Invalid Position");
		}else {
			if(pos==1) {
				addFirst(data);
			}else if(pos==countNode()+1) {
				addLast(data);
			}else {
				DNode newNode = new DNode(data);
				DNode temp = head;
				int count=2;
				while(count!=pos) {
					temp=temp.next;
					count++;
				}
				newNode.next=temp.next;
				temp.next.prev=newNode;
				temp.next=newNode;
				newNode.prev=temp;
			}
		}
	}

	void deleteFirst() {
		if(head==null) {
			System.out.println("Empty LinkedList");
		}else if(countNode()==1) {
			head=null;
		}else {
			head=head.next;
			head.prev=null;
		}
	}

	void deleteLast() {
		if(head==null) {
			System.out.println("Empty LinkedList");
		}else if(countNode()==1) {
			deleteFirst();
		}else {
			DNode temp = head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			temp.next.prev=null;
			temp.next=null;
		}

	}

	void deleteAtPos(int pos) {
		if(pos>countNode()+1 || pos<=0) {
			System.out.println("Invalid Position");
		}else {
			if(pos==1) {
				deleteFirst();
			}else if(pos==countNode()) {
				deleteLast();
			}else {
				DNode temp = head;
				int count=2;
				while(count!=pos) {
					temp=temp.next;
					count++;
				}
				temp.next=temp.next.next;
				temp.next.prev=temp;
			}
		}
	}

	void printDLL() {
		if(head==null) {
			System.out.println("Empty LinkedList");
		}else {
			DNode temp = head;
			while(temp!=null) {
				System.out.print(temp.data);
				temp=temp.next;
				if(temp!=null)
					System.out.print(" <-> ");
			}
			System.out.println();
		}
	}

	int countNode() {
		if(head==null) {
			return 0;
		}else {
			DNode temp = head;
			int count=0;
			while(temp!=null) {
				count++;
				temp=temp.next;
			}
			return count;
		}
	}

}

public class DoublyLinkedList {

	public static void main(String[] args) {

		DLinkedList ll = new DLinkedList();
		char ch;

		do {
			System.out.println("Doubly LinkedList");
			System.out.println("1) Add First");
			System.out.println("2) Add Last");
			System.out.println("3) Add at Pos");
			System.out.println("4) Delete First");
			System.out.println("5) Delete Last");
			System.out.println("6) Delete at Pos");
			System.out.println("7) CountNode");
			System.out.println("8) Print Doubly LinkedList");

			System.out.println("Enter your choice : ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			case 1:{ 
				System.out.println("Enter data : ");
				int data = sc.nextInt();
				ll.addFirst(data);
				break;
			}

			case 2:{ 
				System.out.println("Enter data : ");
				int data = sc.nextInt();
				ll.addLast(data);
				break;
			}

			case 3:{ 
				System.out.println("Enter pos : ");
				System.out.println("Enter data : ");
				int pos = sc.nextInt();
				int data = sc.nextInt();
				ll.addAtPos(pos, data);
				break;
			}

			case 4:
				ll.deleteFirst();
				break;
			case 5:
				ll.deleteLast();
				break;
			case 6:{
				System.out.println("Enter pos : ");
				int pos = sc.nextInt();
				ll.deleteAtPos(pos);
				break;
			}
			case 7:
				System.out.println(ll.countNode());
				break;

			case 8:
				ll.printDLL();
				break;

			default:
				System.out.println("Unexpected value: " + choice);
			}

			System.out.println("Do you want to continue? :(Y or y) ");
			ch = sc.next().charAt(0);

		}while(ch=='Y' || ch=='y');

	}

}
