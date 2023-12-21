package LinkedList;

import java.util.Scanner;

class CNode{
	int data;
	CNode next=null;

	CNode(int data){
		this.data=data;
	}
}

class CirLinkedList{
	CNode head;

	void addFirst(int data) {
		CNode newNode = new CNode(data);
		if(head==null) {
			head=newNode;
			newNode.next=head;
		}else {

			CNode temp = head;
			while(temp.next!=head) {
				temp=temp.next;
			}

			newNode.next=head;
			head=newNode;
			temp.next=head;
		}
	}

	void addLast(int data) {
		CNode newNode = new CNode(data);
		if(head==null) {
			head=newNode;
			newNode.next=head;
		}else {
			CNode temp= head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newNode.next=head;
			temp.next=newNode;
		}
	}

	void addAtPos(int pos,int data) {

		if(pos>countNode()+1|| pos<=0) {
			System.out.println("Invalid Position");
		}else {

			if(pos==1) {
				addFirst(data);
			}else if(pos==countNode()+1) {
				addLast(data);
			}else {
				CNode newNode = new CNode(data);
				CNode temp = head;
				int count = 2;
				while(count!=pos) {
					count++;
					temp=temp.next;
				}
				newNode.next=temp.next;
				temp.next=newNode;

			}	
		}	
	}
	
	void deleteFirst() {

		if(head==null) {
			System.out.println("Empty Circular LinkedList");
		}else if(head.next==head) {
			head=null;
		}else{

			CNode temp = head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			head=head.next;
			temp.next=head;
		}

	}
	
	void deleteLast() {
		if(head==null) {
			System.out.println("Empty Circular LinkedList");
		}else if(head.next==head) {
			head=null;
		}else {
			CNode temp = head;
			while(temp.next.next!=head) {
				temp=temp.next;
			}
			temp.next=head;
		}
	}
	
	void deleteAtPos(int pos) {
		
		if(pos>countNode() || pos<=0) {
			System.out.println("Invalid position");
		}else if(pos==1) {
			deleteFirst();
		}else if(pos==countNode()) {
			deleteLast();
		}else {
			
			CNode temp = head;
			int count = 2;
			
			while(count!=pos) {
				temp=temp.next;
				count++;
			}
			temp.next=temp.next.next;
		}
		
	}
	
	int countNode() {
		
		if(head==null) {
			return 0;
		}
		
		CNode temp=head;
		int count=0;
		
		do {
			count++;
			temp=temp.next;			
		}
		while(temp!=head);
		
		return count;
	}
	
	void printCircularLinkedList() {
		CNode temp = head;
		while(temp.next!=head) {
			System.out.print(temp.data+" -> ");
		}
	}
	
}

public class CircularLinkedList {
	public static void main(String[] args) {

		LinkedList cll = new LinkedList();
		char ch;
		
		do {
			System.out.println("Singly LinkedList");
			System.out.println("1) Add First");
			System.out.println("2) Add Last");
			System.out.println("3) Add at Pos");
			System.out.println("4) Delete First");
			System.out.println("5) Delete Last");
			System.out.println("6) Delete at Pos");
			System.out.println("7) CountNode");
			System.out.println("8) Print Circular LinkedList");
			
			System.out.println("Enter your choice : ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:{ 
					System.out.println("Enter data : ");
					int data = sc.nextInt();
					cll.addFirst(data);
					break;
				}
					
				case 2:{ 
					System.out.println("Enter data : ");
					int data = sc.nextInt();
					cll.addLast(data);
					break;
				}
				
				case 3:{ 
					System.out.println("Enter pos : ");
					System.out.println("Enter data : ");
					int pos = sc.nextInt();
					int data = sc.nextInt();
					cll.addAtPos(pos, data);
					break;
				}
				
				case 4:
					cll.deleteFirst();
					break;
				case 5:
					cll.deleteLast();
					break;
				case 6:{
					System.out.println("Enter pos : ");
					int pos = sc.nextInt();
					cll.deleteAtPos(pos);
					break;
				}
				case 7:
					System.out.println(cll.countNode());
					break;
				
				case 8:
					cll.printSLL();
					break;
				
				default:
					System.out.println("Unexpected value: " + choice);
			}
			
			System.out.println("Do you want to continue? :(Y or y) ");
			ch = sc.next().charAt(0);
					
		}while(ch=='Y' || ch=='y');
	}
}















