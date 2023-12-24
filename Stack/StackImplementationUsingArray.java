package Stack;
import java.util.Scanner;

class MyStack{
	int maxSize;
	int[] stackArr;
	int top=-1;

	MyStack(int size){
		this.maxSize=size;
		this.stackArr=new int[maxSize];
	}

	void push(int data) {
		if(top==-1) {
			top++;
			stackArr[top]=data;
		}else if(top<maxSize-1){
			top++;
			stackArr[top]=data;
		}else {
			throw new StackOverflowException();
		}
	}

	int pop() {
		if(isEmpty())
			throw new StackUnderflowException();
		else {
			int val = stackArr[top];
			top--;
			return val;
		}
	}

	boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}

	int search(int data) {
		if(isEmpty()) {
			return -1;
		}else {
			int val=0;
			boolean flag=false;
			for (int i = top; i >=0; i--) {
				val++;
				if(stackArr[i]==data) {
					flag=true;
					break;
				}
			}
			if(flag==true)
				return val;
			else
				return -1;
		}
	}

	int peek() {
		if(isEmpty())
			throw new StackUnderflowException();
		else
			return stackArr[top];
	}

	void printStack() {
		if(isEmpty()) {
			System.out.println("Empty Stack");
		}else {
			for (int i = 0; i <=top; i++) {
				System.out.print("|_"+stackArr[i]+" ");
			}
			System.out.println();
		}
	}

}

public class StackImplementationUsingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack : ");
		int size = sc.nextInt();
		MyStack s = new MyStack(size);
		char choice;
		do {
			System.out.println("Stack Operations : ");
			System.out.println("1)push ");
			System.out.println("2)pop ");
			System.out.println("3)peek ");
			System.out.println("4)search ");
			System.out.println("5)isEmpty ");
			System.out.println("6)printStack ");

			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();

			switch(ch) {
			case 1:{
				System.out.println("Enter data : ");
				int data = sc.nextInt();
				try {
					s.push(data);
				}catch (StackOverflowException e) {
					System.out.println(e.getMessage());
				}
				break;
			}

			case 2:
				try {
					s.pop();
				}catch (StackUnderflowException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 3:
				try {
					System.out.println(s.peek());
				}catch (StackUnderflowException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:{
				System.out.println("Enter data to search : ");
				int data = sc.nextInt();
				try {
					int ans = s.search(data);
					System.out.println(ans);
				}catch (StackOverflowException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case 5:
				if(s.isEmpty()) {
					System.out.println("Stack is empty");
				}else {
					System.out.println("Stack is not empty");					
				}
				break;
				
			case 6:
				s.printStack();
				break;
			
			default:
				System.out.println("Invalid Choice");
			}

			System.out.println("Do you want to continue :(y or Y) ");
			choice = sc.next().charAt(0);

		}while(choice=='y' || choice=='Y');
	}

}
