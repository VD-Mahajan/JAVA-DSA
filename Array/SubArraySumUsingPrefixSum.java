package Array;
public class SubArraySumUsingPrefixSum {
    
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,1,3};
        int n =arr.length;
        int[] ps = new int[n];

        ps[0]=arr[0];
        for (int i = 1; i <n; i++) {
            ps[i]=ps[i-1]+arr[i];
        }

        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j =i; j<n; j++) {
                if(i==0)
                    sum=ps[j];
                else
                    sum+=ps[j]-ps[j-1];
                System.out.println(sum);
            }            
        }
    }
}
