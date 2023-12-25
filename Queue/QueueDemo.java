package Queue;
import java.util.*;

class Queue{

	private int front=-1;
	private int rear=-1;
	private int maxSize;
	private int[] arr;

	Queue(int size){
		this.maxSize=size;
		arr=new int[maxSize];
	}

	void enque(int data) {
		if(front==-1) {
			front=rear=0;
		}else if(rear==maxSize-1) {
			System.out.println("Queue is full");
			return;
		}else {
			rear++;
		}
		arr[rear]=data;
	}

	int deque() {
		if(front==-1) {
			System.out.println("Empty Queue");
			return -1;
		}else if(front==rear){
			int ans = arr[rear];
			front=rear=-1;
			return ans;
		}else {
			int ans = arr[front];
			front++;
			return ans;
		}
	}

	int front() {
		if(front==-1) {
			System.out.println("Empty Queue");
			return -1;
		}else {
			return arr[front];
		}
	}

	int rear() {
		if(front==-1) {
			System.out.println("Empty Queue");
			return -1;
		}else {
			return arr[rear];
		}
	}

	boolean isEmpty() {
		if(front==-1) {
			return true;
		}else {
			return false;
		}
	}

	void printQueue() {
		if(front==-1) {
			return;
		}else {
			for(int i=front;i<=rear;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

}

public class QueueDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Queue size : ");
		int size = sc.nextInt();
		Queue q = new Queue(size);
		char choice;

		do {

			System.out.println("Queue");
			System.out.println("1)enque");
			System.out.println("2)deque");
			System.out.println("3)front");
			System.out.println("4)rear");
			System.out.println("5)isEmpty");
			System.out.println("6)printQueue");

			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1: {
				System.out.println("Enter data : ");
				int data = sc.nextInt();
				q.enque(data);
			}
			break;
			
			case 2: {
				int data = q.deque();
				System.out.println(data);
			}
			break;
			
			case 3: {
				System.out.println(q.front());
			}
			break;
			
			case 4: {
				System.out.println(q.rear());
			}
			break;
			
			case 5: {
				if(q.isEmpty())
					System.out.println("Queue is empty");
				else
					System.out.println("Queue is not empty");					
			}
			break;
			
			case 6:
				q.printQueue();
				break;

			default:
				System.out.println("Invalid choice ");
			}

			System.out.println("Do you want to continue :(y/Y)");
			choice = sc.next().charAt(0);
		}while(choice=='y' || choice=='Y');



	}
}
