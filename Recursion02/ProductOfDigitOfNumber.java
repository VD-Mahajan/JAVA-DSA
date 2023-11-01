package Recursion02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOfDigitOfNumber {
	
	static int productOfDigits(int num) {
		
		if(num==0)
			return 1;
		
		return (num%10)*productOfDigits(num/10);
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an number : ");
		int num;
		try {
			num = Integer.parseInt(br.readLine());			
			System.out.println(productOfDigits(num));
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
	}
	
}
