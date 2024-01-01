package Array;

public class EquillibriumIndexOptimized {
	
	public static void main(String[] args) {
		int[] arr=new int[]{-7,1,5,2,-4,3,0};
        int[] prefixSum=new int[arr.length];
        int[] postfixSum=new int[arr.length];
        
        prefixSum[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
        
        
        postfixSum[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) {
        	postfixSum[i]=postfixSum[i+1]+arr[i];
        }
        
        for (int i = 0; i < arr.length; i++) {
			if(prefixSum[i]==postfixSum[i]) {
				System.out.println("equillibrium index : "+i);
				break;
			}
		}
	}
}
