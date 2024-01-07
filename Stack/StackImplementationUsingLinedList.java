package Stack;

class Node{
	Node next=null;
	int data;

	public Node(int data) {
		this.data=data;
	}
}

class StackUsingLinkedList{
	Node head = null;

	void push(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			newNode.next=null;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.next=null;
		}
	}

	int pop() {
		int returnValue=-1;

		Node temp=head;
		if(temp==null) {
			return -1;
		}else if(temp.next==null) {
			returnValue=temp.data;
			head=null;
		}else {
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			returnValue=temp.next.data;
			temp.next=null;
		}

		return returnValue;
	}

	boolean isEmpty() {
		if(head==null)
			return true;
		else
			return false;
	}

	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}

public class StackImplementationUsingLinedList {
	public static void main(String[] args) {
		StackUsingLinkedList ll = new StackUsingLinkedList();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.pop();
		ll.display();
		System.out.println(ll.isEmpty());
	}
}
