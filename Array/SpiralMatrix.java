package Array;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int start=0;
		int end=arr.length-1;
		int count=1;
		int row=0;
		int col=0;
		while(start<=end) {
			for (int i = start; i < end; i++) {
				arr[row][col]=count++;
				col++;
			}
			for (int i = start; i < end; i++) {
				arr[row][col]=count++;
				row++;
			}
			for (int i = start; i < end; i++) {
				arr[row][col]=count++;
				col--;
			}
			for (int i = start; i < end; i++) {
				arr[row][col]=count++;
				row--;
			}
			if(col==arr.length/2) {
				arr[row][col]=count;
			}
			start++;
			end--;
			col++;
			row++;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
