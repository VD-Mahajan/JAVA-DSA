package BinarySearch;

public class PeakElement {
	
	static int searchPeakElement(int[] arr,int start,int end) {
		
		int mid = (start+end)/2;
		
		if(start>end)
			return -1;
		
		if(arr[start]>arr[start+1] && start==0)
			return start;
		
		if(arr[end]>arr[end-1] && end == arr.length-1)
			return end;
		
		if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) 
			return mid;
		
		if(arr[mid]>arr[end])
			return searchPeakElement(arr, start, mid-1);
		else
			return searchPeakElement(arr, mid+1, end);
			
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,3,7,10,11,4,3,2,1,0};
		int ans = searchPeakElement(arr,0,arr.length-1);
		System.out.println(ans);
	}
}
