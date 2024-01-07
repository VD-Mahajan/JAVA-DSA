package Stack;

class TwoStackDemo {

	int[] arr;
	int top1;
	int top2;

	public TwoStackDemo(int size) {
		arr=new int[size];
		top1=-1;
		top2=size;
	}

	void push1(int data) {
		if(top1<top2-1) {
			top1++;
			arr[top1]=data;			
		}else {
			System.out.println("Stack Overflow");			
		}
	}
	void push2(int data) {
		if(top2>top1+1) {
			top2--;
			arr[top2]=data;			
		}else {
			System.out.println("Stack Overflow");			
		}
	}

	int pop1() {
		int returnValue=-1;
		if(top1!=-1) {
			returnValue=arr[top1];
			top1--;
		}
		return returnValue;
	}
	
	int pop2() {
		int returnValue=-1;
		if(top2!=arr.length) {
			returnValue=arr[top2];
			top2++;
		}
		return returnValue;
	}

	void display() {
		for (int i = 0; i <=top1; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i = arr.length-1; i >= top2; i--) {
			System.out.print(arr[i]+" ");			
		}
	}
}

public class TwoStack{
	public static void main(String[] args) {
		TwoStackDemo ts = new TwoStackDemo(6);
		ts.push1(1);
		ts.push1(2);
		ts.push1(3);
		ts.push2(6);
		ts.push2(5);
		ts.pop1();
		ts.pop2();
		ts.push2(4);
		ts.display();
		
	}
}
