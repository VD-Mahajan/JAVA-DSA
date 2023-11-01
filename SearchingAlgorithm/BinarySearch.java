package SearchingAlgorithm;

public class BinarySearch {
	
	static int search(int[] arr,int start,int end,int element) {
		int mid;
		while(start<end) {
			mid=start+end;

			if(arr[mid]==element)
				return mid;
			if(arr[mid]>element)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;	
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int ans = search(arr,0,arr.length-1,7);
		System.out.println(ans);
		
	}

}
