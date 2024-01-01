package Sorting;

public class SelectionSort {
	
	static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {26,73,94,4,6,75,2,3,49,11,9};
		selectionSort(arr);
		
		for(int element : arr) {
			System.out.print(element+" ");
		}
	}
}
