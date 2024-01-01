package Sorting;

public class BubbleSortInRecursion {
	
	static void bubbleSort(int[] arr,int j) {
		
		if(j==1)
			return;
		
		for(int i=0;i<j;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		
		bubbleSort(arr, j-1);
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {4,26,73,94,4,6,75,2,3,49,11};
		bubbleSort(arr,arr.length-1);
		for(int element : arr) {
			System.out.print(element+" ");
		}
	}
	
}
