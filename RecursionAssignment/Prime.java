package RecursionAssignment;

public class Prime {
	 static boolean isPrime(int n,int i) {
		 
		 if(n%i==0 && n!=i)
			 return false;
		 
		 if(n==i)
			 return true;
		 
		 return isPrime(n, i+1);
	     	 
	 }
	
	 public static void main(String[] args) {
		if(isPrime(97,2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");			
		}
	}
}




