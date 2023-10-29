package Array;
public class MaxSumUsingPrefixSum {
    
    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum =0,maxSum=Integer.MIN_VALUE,n=arr.length;
        int[] ps = new int[n];

        ps[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            ps[i]=ps[i-1]+arr[i];                       //[-2,-1,-4,0,-1,1,2,-3,1]
        }

        for (int i = 0; i < n; i++){
            sum=0;
            for (int j = i; j < n; j++) {
                if(i==0){
                    sum=ps[j];
                }else{
                    sum=ps[j]-ps[i-1];
                }
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