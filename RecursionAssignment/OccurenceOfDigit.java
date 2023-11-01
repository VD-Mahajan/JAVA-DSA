package RecursionAssignment;

public class OccurenceOfDigit {
	static int occurenceOfDigit(int num, int digit) {
		int count = 0;
		
		if(num%10==digit)
			count++;
		
		if(num==0)
			return num;
		
		return count+occurenceOfDigit(num/10,digit);
	}
	
	public static void main(String[] args) {
		
		int num = 12347744;
		int ans = occurenceOfDigit(num,7);
		System.out.println(ans);
	}
}
