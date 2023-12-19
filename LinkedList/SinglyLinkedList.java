package LinkedList;

import java.util.Scanner;

class Node{
	int data;
	Node next = null;

	Node(int data){
		this.data = data;
	}
}

class LinkedList{
	Node head = null;


	void addLast(int data) {
		Node newNode = new Node(data);

		if(head==null) {

			head=newNode;

		}else {
			Node temp = head;

			while(temp.next!=null) {

				temp = temp.next;	
			}

			temp.next=newNode;
		}
	}

	void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
	}

	void addAtPos(int pos,int data) {

		if(pos<=0 || pos>=countNode()+2) {
			System.out.println("Wrong Input");
			return;
		}

		if(pos==1) {	
			addFirst(data);	
		}else if(pos==countNode()+1) {
			addLast(data);
		}else {


			Node newNode = new Node(data);
			Node temp = head;

			while(pos-2!=0) {
				temp = temp.next;
				pos--;
			}

			newNode.next=temp.next;
			temp.next=newNode;
		}
	}

	void deleteFirst() {

		if(head==null) {
			System.out.println("Empty linkedlist");
			return;
		}
		if(countNode()==1){
			head =null;
		}else {
			head = head.next;
		}
	}
	void deleteLast() {
		
		if(head==null) {
			System.out.println("Empty linkedlist");
			return;
		}
		if(countNode()==1){
			head =null;
		}else {
			Node temp = head;
			while(temp.next.next!=null) {
				temp=temp.next;				
			}
			temp.next=null;
		}
	}

	void deleteAtPos(int pos) {
		if(pos<=0 || pos>countNode()) {
			System.out.println("Wrong Input");
			return;
		}
		if(pos==1) {
			deleteFirst();
		}else if(pos==countNode()) {
			deleteLast();
		}else {
			Node temp = head;
			
			while(pos-2!=0) {
				temp=temp.next;
				pos--;
			}
			
			temp.next=temp.next.next;
		}
	}
	
	
	int countNode() {
		Node temp = head;
		int count=0;

		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	void printSLL(){

		if(head==null) {

			System.out.println("Empty LinkedList");			

		}else {
			Node temp = head;

			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}
			System.out.println();
		}	
	}

}


public class SinglyLinkedList {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
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
			System.out.println("8) Print Singly LinkedList");
			
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
					ll.deleteAtPos(choice);
					break;
				}
				case 7:
					System.out.println(ll.countNode());
					break;
				
				case 8:
					ll.printSLL();
					break;
				
				default:
					System.out.println("Unexpected value: " + choice);
			}
			
			System.out.println("Do you want to continue? :(Y or y) ");
			ch = sc.next().charAt(0);
					
		}while(ch=='Y' || ch=='y');
	}
}
