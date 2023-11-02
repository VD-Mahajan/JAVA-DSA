package BinarySearch;

public class ClosestElement {
	
	static int maxElement = Integer.MAX_VALUE;
	static int minElement = Integer.MIN_VALUE;
	
	static int closestElement(int[] arr,int start,int end, int element) {
		
		int mid = (start+end)/2;
		
		if(start>end && element-minElement<maxElement-element)
			return minElement;
		
		if(start>end && element-minElement>maxElement-element)
			return maxElement;
		
		if(arr[mid]==element)
			return mid;
		
		if(arr[mid]<element) {
			minElement = arr[mid];
			return closestElement(arr,mid+1,end,element);			
		}
		else {
			maxElement = arr[mid];
			return closestElement(arr,start,mid-1,element);
		}
			
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,5,8,8,9,11};
		int element = 13;
		int ans = closestElement(arr, 0, arr.length-1, element);
		
		System.out.println(ans);
		
	}
	
}