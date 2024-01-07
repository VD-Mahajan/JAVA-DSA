package Stack;

public class ImmediateSmallerElement {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4,2,1,5,3};
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1]>arr[i])
				System.out.print(arr[i]+" ");
			else 
				System.out.print("-1 ");
		}
		System.out.println("-1");
		
	}
}
