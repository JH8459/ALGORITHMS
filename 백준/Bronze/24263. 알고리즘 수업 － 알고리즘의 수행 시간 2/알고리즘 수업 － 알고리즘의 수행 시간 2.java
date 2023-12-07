import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        /*
         * 시간복잡도 O(n)
         * 
         * MenOfPassion(A[], n) {
         * sum <- 0;
         * for i <- 1 to n
         * sum <- sum + A[i]; # 코드1
         * return sum;
         * }
         * }
         */

        bw.write(n + "\n" + 1 + "\n");

        bw.flush();
    }
}