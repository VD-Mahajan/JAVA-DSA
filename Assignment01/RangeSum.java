package Assignment01;
public class RangeSum {
    public static void main(String[] args) {
        int[] A=new int[] {1,2,3,4,5};   
        int[][] B=new int[][]{{0,3},{1,2}};
        int[] ans=new int[B.length];
        int sum=0;

        for(int i=0;i<A.length;i++){
            sum=sum+A[i];
            A[i]=sum;
        }

        for(int i=0;i<B.length;i++){
            if(B[i][0]==0){
                ans[i]=A[B[i][1]];
            }else{
                ans[i]=A[B[i][1]]-A[B[i][0]-1];
            }
        }
        for(int i:ans){
            System.out.println(i);
        }
    }
}
