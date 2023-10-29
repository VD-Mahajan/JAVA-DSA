package Array;
public class EqullibriumIndex {
    public static void main(String[] args) {
        int[] arr=new int[]{-7,1,5,2,-4,3,0};
        int n=arr.length;
        boolean flag=false;
        
        for(int i=0;i<n;i++){
            int rsum=0,lsum=0;
            for(int j=0;j<i;j++){
                lsum=lsum+arr[j];
            }
            for(int j=i+1;j<n;j++){
                rsum=rsum+arr[j];
            }
            if(rsum==lsum){
                System.out.println(i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("-1 ");
        }

    }
}



//Time Complexity : O(N^2)