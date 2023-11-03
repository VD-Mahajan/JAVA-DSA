package BinarySearch;

public class CountOfOnes {
	static int ans = 0;
	static int onesOccurence(int[] arr,int start,int end) {
		int mid = (start+end)/2;
		
		if(start>end) 
			return arr.length-ans;
		
		if(arr[mid]==1) {
			ans = mid;
			return onesOccurence(arr, start, mid-1);
		}else {
			return onesOccurence(arr, mid+1, end);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {0,0,1,1,1,1,1};
		int ans = onesOccurence(arr, 0, arr.length-1);
		System.out.println(ans);
	}
}
