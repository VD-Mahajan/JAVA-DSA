package BinarySearch;

public class SearchFirstOccurence {
	static int firstOccurence = 0;
	static boolean flag = false;
	
	static int firstOccurence(int[] arr,int start,int end, int element) {
		
		int mid = (start+end)/2;
		
		if(arr[mid]!=element && firstOccurence==mid+1)
			return firstOccurence;
		
		if(start>end && flag==false)
			return -1;
		
		if(start>end && flag==true)
			return firstOccurence;
		
		if(arr[mid]==element) {	
			firstOccurence=mid;	
			flag=true;
			return firstOccurence(arr,start,end-1,element);			
		}
		
		if(arr[mid]<element)
			return firstOccurence(arr,mid+1,end,element);
		else
			return firstOccurence(arr,start,mid-1,element);
				
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,1,1,2,3,3,3,4,5,6,7,8,9};
		int element = 1;
		int ans = firstOccurence(arr, 0, arr.length-1, element);
		
		System.out.println(ans);
		
	}
}
