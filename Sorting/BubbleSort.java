package Sorting;

public class BubbleSort {
	
	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		 
		int[] arr = new int[] {4,26,73,94,4,6,75,2,3,49,11};
		bubbleSort(arr);
		
		for(int element : arr) {
			System.out.print(element+" ");
		}
	}
}
