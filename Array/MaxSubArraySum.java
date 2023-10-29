//Brute Force
package Array;

class MaxSubArraySum{
    public static void main(String[] args) {
        
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum =0,maxSum=Integer.MIN_VALUE,n=arr.length;

        for(int i=0;i<n;i++){
            for (int j = i; j <n; j++) {
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if (sum>maxSum) {
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}


//TC = O(N^3)
//SC = O(1)