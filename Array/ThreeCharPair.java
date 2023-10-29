package Array;
class ThreeCharPair{
    public static void main(String[] args) {
        char[] arr=new char[]{'a','b','c','c','a','b','c'};
        int n =arr.length;
        int a_count=0,b_count=0,pair=0;

        for(int i=0;i<n;i++){
            if(arr[i]=='a'){
                a_count++;
            }else if(arr[i]=='b'){
                b_count=a_count;
            }else if (arr[i]=='c'){
                pair=pair+b_count;
            }
        }
        System.out.println(pair);
    }
}