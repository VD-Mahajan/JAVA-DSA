package Sorting;

public class InsertionSort {

	static void insertionSort(int[] arr){

		for (int i = 1; i < arr.length; i++) {
			int temp=arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = temp;			
			
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] {4,26,73,94,4,6,75,2,3,49,11};
		insertionSort(arr);
		for(int element : arr) {
			System.out.print(element+" ");
		}
	}
}
