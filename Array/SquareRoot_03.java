package Array;
import java.io.*;

class SquareRoot_03 {
    static int sqrt(int num) {
        int ans = 0;
        int itr = 0;
        
        int start = 1;
        int end = num;
        while(start<=end){
            itr++;
            int mid=(start+end)/2;
            int sqr = mid*mid;

            if(sqr==num)
                ans = mid;
            if(sqr>num){
                end=mid-1;
            }else{
                start = mid+1;
                ans = mid;
            }

        }

        System.out.println("Iterations : " + itr);
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        int num = Integer.parseInt(br.readLine());
        int val = sqrt(num);
        System.out.println("Square root : " + val);
    }
}