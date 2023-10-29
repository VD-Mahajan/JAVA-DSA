package Array;
class RightMax{
    public static void main(String[] args) {
        int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};               //
        int n=arr.length;
        int[] RMarr = new int[n];
        RMarr[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(RMarr[i+1]<arr[i]){
                RMarr[i]=arr[i];
            }else{
                RMarr[i]=RMarr[i+1];
            }
               
        }

        for(int i:RMarr){
            System.out.print(i+" ");
        }
    }
}