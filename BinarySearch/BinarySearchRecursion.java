package BinarySearch;

public class BinarySearchRecursion {

	static int search(int[] arr,int start,int end, int element) {
		
		int mid = (start+end)/2;
		if(start>end)
			return -1;
		
		if(arr[mid]==element)
			return mid;
		
		if(arr[mid]<element)
			return search(arr,mid+1,end,element);
		else
			return search(arr,start,mid-1,element);
			
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,11};
		int element = 11;
		int ans = search(arr, 0, arr.length-1, element);
		
		System.out.println(ans);
		
	}
	
}
