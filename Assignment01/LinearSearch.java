package Assignment01;
public class LinearSearch {
    static int count(int[] arr,int num){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,2,6};
        System.out.println(LinearSearch.count(arr,2));

    }
}
