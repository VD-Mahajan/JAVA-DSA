package Array;

import java.util.Arrays;

public class ThirdLargestNumber {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,8,16,16,16};
		int count=1;
		
		Arrays.sort(arr);
		int largestElement = arr[arr.length-1];
		int thirdLargest=0;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<largestElement) {
				thirdLargest=arr[i];
				largestElement=arr[i];
				count++;
			}
			if(count==3) {
				System.out.println(thirdLargest);
				break;
			}
		}
	}
	
}
