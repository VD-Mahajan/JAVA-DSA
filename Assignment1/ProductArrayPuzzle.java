package Assignment1;
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int n=arr.length;
        int[] leftProduct=new int[n];
        int[] rightProduct=new int[n];

        leftProduct[0]=1;
        for(int i=1;i<n;i++){
            leftProduct[i]=leftProduct[i-1]*arr[i-1];           //[1,1,2,6,24]
        }

        rightProduct[n-1]=1;
        for(int i=n-2;i>=0;i--){
            rightProduct[i]=rightProduct[i+1]*arr[i+1];         //[120,60,20,5,1]
        }

        for(int i=0;i<n;i++){
            arr[i]=leftProduct[i]*rightProduct[i];
            System.out.println(arr[i]);
        }

    }
}
