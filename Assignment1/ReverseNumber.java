package Assignment1;
public class ReverseNumber {
    static long reverse(int x){
        long rev=0;
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return rev;
    }
    static int reverseDigit(int x){
        long num = reverse(x);
        if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE){
            return 0;
        }else{
            return (int)num;
        }
    }
    public static void main(String[] args) {
        int n=777892345;
        System.out.println(reverseDigit(n));
    }
}
