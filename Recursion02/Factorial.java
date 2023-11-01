package Recursion02;
import java.io.*;

public class Factorial {
	
	static int factorialOfNumber(int num) {
		
		if(num==1)
			return 1;
		
		return num*factorialOfNumber(num-1);
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an number : ");
		int num;
		try {
			num = Integer.parseInt(br.readLine());			
			System.out.println(factorialOfNumber(num));
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
	}
	
}
