package Assignment01;
public class TimeToEquality {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,1,3,2};
        int max = Integer.MIN_VALUE;
        int seconds=0;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                seconds=(max-arr[i])+seconds;
            }
        }

        System.out.println(seconds);
    }
}
