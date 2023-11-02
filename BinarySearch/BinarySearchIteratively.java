package BinarySearch;

public class BinarySearchIteratively {

	static int search(int[] arr,int start,int end, int element) {
		
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(arr[mid]==element) 
				return mid;
			if(arr[mid]>element) 
				end = mid-1;
			else
				start = mid+1;
		}
		
		return -1;
			
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,11};
		int element = 11;
		int ans = search(arr, 0, arr.length-1, element);
		
		System.out.println(ans);
		
	}
	
	
	
}
