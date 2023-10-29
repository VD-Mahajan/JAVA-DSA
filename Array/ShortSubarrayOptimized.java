package Array;
public class ShortSubarrayOptimized {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,6,3,41,4,6,3};
        int n=arr.length,length=0;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int minlen=Integer.MAX_VALUE;
         
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<n;i++){  
            if(min==max){
                minlen=1;
                break;
            }
            if(arr[i]==min){
                length=1;
            }
            if(arr[i]==max){
                if(minlen>length){
                    minlen=length;
                }
            }
            length++;           
        }
        for(int i=0;i<n;i++){  
            if(min==max){
                minlen=1;
                break;
            }
            if(arr[i]==max){
                length=1;
            }
            if(arr[i]==min){
                if(minlen>length){
                    minlen=length;
                }
            }
            length++;           
        }
        System.out.println(minlen);
    }
}
