package Array;
public class SubArraySumUsingCarryFor {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,1,3};
        int n =arr.length,sum;

        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                System.out.println(sum);
            }
        }

    }
}

