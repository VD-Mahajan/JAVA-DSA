package Recursion01;

public class FactorialOfNumber {
	
	static int factorialOfNumber(int num) {
		
		if(num==0)
			return 1;
		
		return num*factorialOfNumber(num-1);
	}
	public static void main(String[] args) {
		
		int num = 5;
		int ans = factorialOfNumber(num);
		System.out.println(ans);
	}
}
