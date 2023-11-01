package RecursionAssignment;

public class Palindrome {
	
	static int isPalindrome(int num) {
		
		int digit = 0,tempNo=num;
		int temp = num%10;
		if(num==0)
			return 0;
		
		while(tempNo!=0) {
			digit++;
			tempNo/=10;
		}
		while(digit!=0) {
			temp *= 10;
			digit--;
		}

		return temp + isPalindrome(num/10);
	}

	public static void main(String[] args) {
		int num = 1221;
		int ans = isPalindrome(num)/10;

		if(num==ans)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		
	}
}
