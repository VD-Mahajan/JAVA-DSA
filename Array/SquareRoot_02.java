package Array;
import java.io.*;

class SquareRoot_02 {
    static int sqrt(int num) {
        int ans = 0;
        int itr = 0;
        for (int i = 1; i <= num; i++) {
            itr++;
            if (i * i <= num)
                ans = i;
            else
                break;
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