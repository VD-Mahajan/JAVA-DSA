package BinarySearch;

public class SearchLastOccurence {
	static int lastOccurence = 0;
	static boolean flag = false;
	
	static int lastOccurence(int[] arr,int start,int end, int element) {
		
		int mid = (start+end)/2;
		
		if(arr[mid]!=element && lastOccurence==mid-1)
			return lastOccurence;
		
		if(start>end && flag==false)
			return -1;
		
		if(start>end && flag==true)
			return lastOccurence;
		
		if(arr[mid]==element) {	
			lastOccurence=mid;	
			flag=true;
			return lastOccurence(arr,start+1,end,element);			
		}
		
		if(arr[mid]<element)
			return lastOccurence(arr,mid+1,end,element);
		else
			return lastOccurence(arr,start,mid-1,element);
				
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,1,1,2,3,3,3,4,5,6,7,8,9};
		int element = 1;
		int ans = lastOccurence(arr, 0, arr.length-1, element);
		
		System.out.println(ans);
		
	}
}
