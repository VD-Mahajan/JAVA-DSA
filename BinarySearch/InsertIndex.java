package BinarySearch;

public class InsertIndex {
	
	static int returnIndex(int[] arr,int element,int start,int end) {
		
		int mid = (start+end)/2;
		
		if(start>end)
			return -1;
		
		if(arr[mid]>element)
			return returnIndex(arr, element, start,mid-1);
		else
			return returnIndex(arr, element, mid+1,end);
			
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,5,6,7,8,9};
		int element = 4;
		int ans = returnIndex(arr,element,0,arr.length-1);
		
		System.out.println(ans);
		
	}
}
