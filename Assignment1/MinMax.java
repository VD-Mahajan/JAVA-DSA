package Assignment1;
class MinMax{
    static int minmaxSum(int[] arr){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return min+max;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,4,1};
        int ans = MinMax.minmaxSum(arr);
        System.out.println(ans);
    }
}
