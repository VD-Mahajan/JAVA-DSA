package Array;
public class MaxSumUsingCarryFor {
    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum =0,maxSum=Integer.MIN_VALUE,n=arr.length;

        for (int i = 0; i <n; i++) {
            sum=0;
            for (int j =i; j <n; j++) {
                sum+=arr[j];
                if (sum>maxSum) {
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}



// TC = O(N^2)
// SC = O(N)