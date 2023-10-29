package Array;
class LeftMax{
    public static void main(String[] args) {
        int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int n=arr.length;
        int[] LMarr = new int[n];

        LMarr[0]=arr[0];
        for(int i=1;i<n;i++){
            if(LMarr[i-1]>arr[i]){
                LMarr[i]=LMarr[i-1];
            }else{
                LMarr[i]=arr[i];
            }
        }

        for(int i:LMarr){
            System.out.print(i+" ");
        }
    }
}