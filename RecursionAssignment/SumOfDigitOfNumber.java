package RecursionAssignment;

public class SumOfDigitOfNumber {
	
	static int sumOfDigit(int num) {
		
		if(num==0)
			return num;
		
		return num%10+sumOfDigit(num/10);
	}
	
	public static void main(String[] args) {
		
		int num = 1234;
		int ans = sumOfDigit(num);
		System.out.println(ans);
	}
	
}
