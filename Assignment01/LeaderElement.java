package Assignment01;
public class LeaderElement {
   public static void main(String[] args) {
        int[] arr=new int[]{16,17,4,3,5,2};
        int max=Integer.MIN_VALUE;

        for(int i=arr.length-1;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                System.out.println(max);
            }
        }
   } 
}
