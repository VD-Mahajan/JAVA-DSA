package Array;
public class EqullibriumIndexOptimized {
    public static void main(String[] args) {
        int[] arr=new int[]{-7,1,5,2,-4,2,1};
        int n=arr.length;
        int[] PrefixSumarr=new int[n];
        int[] LPrefixSumarr=new int[n];

        PrefixSumarr[0]=arr[0];

        for(int i=1;i<n;i++){
            PrefixSumarr[i]=PrefixSumarr[i-1]+arr[i];
        }
        LPrefixSumarr[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            LPrefixSumarr[i]=LPrefixSumarr[i+1]+arr[i];
        }
        for(int i=0;i<n;i++){
            if(LPrefixSumarr[i]==PrefixSumarr[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
