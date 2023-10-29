package Array;
public class TwoCharPair {
    public static void main(String[] args) {
        char[] arr=new char[]{'a','b','e','g','a','g'};
        int n =arr.length;
        int a_count=0,pair=0;

        for(int i=0;i<n;i++){
            if(arr[i]=='a'){
                a_count++;
            }else if (arr[i]=='g'){
                pair =pair+a_count;
            }
        }

        System.out.println(pair);
    }
}
