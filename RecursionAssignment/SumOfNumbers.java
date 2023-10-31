package RecursionAssignment;

public class SumOfNumbers {
	static int sumOfNumbers(int n) {
		if(n==0) {
			return 0;
		}
		return n+sumOfNumbers(n-1);
	}
	public static void main(String[] args) {
		int ans = sumOfNumbers(5);
		System.out.println(ans);
	}
}
