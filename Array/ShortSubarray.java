package Array;
public class ShortSubarray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,1,3,4,6,4,6,3};
        int n=arr.length,length=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int itr=0;
         
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]==max){
                for(int j=i+1;j<n;j++){
                    itr++;
                    if(arr[j]==min && length>(j-i+1)){
                        length=j-i+1;
                    }
                }
            }
            if(arr[i]==min){
                for(int j=i+1;j<n;j++){
                    itr++;
                    if(arr[j]==max && length>(j-i+1)){
                        length=j-i+1;
                    }
                }
            }
        }
        System.out.println(length);
        System.out.println(itr);
    }
}
