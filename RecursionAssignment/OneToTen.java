package RecursionAssignment;

public class OneToTen {
	
	static void printNumber(int n) {
		if(n==0) {
			return;
		}
		printNumber(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		printNumber(10);
	}
}
