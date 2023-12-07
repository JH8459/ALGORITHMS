import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        /*
         * 시간복잡도 O(1)
         * 
         * MenOfPassion(A[], n) {
         * i = ⌊n / 2⌋;
         * return A[i]; # 코드1
         * }
         */

        bw.write(1 + "\n" + 0 + "\n");

        bw.flush();
    }
}
