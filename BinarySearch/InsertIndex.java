package BinarySearch;

public class InsertIndex {
	
	static int solve(int[] arr,int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return -1;
			}
		}
		int ans = returnIndex(arr,element,0,arr.length-1);
		return ans;
		
	}

	static int returnIndex(int[] arr,int element,int start,int end) {
		
		int mid = (start+end)/2;
		
		if(start>end)
			return -1;
		
		if(arr[mid]>element) {
			if(arr[mid]-element==1) {
				return mid;	
			}
			return returnIndex(arr, element, start,mid-1);
		}else {
			if(element-arr[mid]==1) {
				return mid+1;
			}
			return returnIndex(arr, element, mid+1,end);
		}
			
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,5,6,7,8,9};
		int element = 4;
		int ans = solve(arr, element);
		if(ans==-1)
			System.out.println("cannot find position");
		else
			System.out.println("Insert element at index : "+ans);
	}
}
