package RecursionAssignment;

public class LengthOfDigit {
	static int length(int n) {
		if(n==0) {
			return 0;
		}
		return 1+length(n/10);
	}
	public static void main(String[] args) {
		int ans = length(4567);
		System.out.println(ans);
	}
}
