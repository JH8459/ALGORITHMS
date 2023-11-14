import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]);
        int m = Integer.parseInt(s.split(" ")[1]);

        int[] intArr = new int[n];

        for (int cnt = 0; cnt < m; cnt++) {
            String basket = br.readLine();

            int i = Integer.parseInt(basket.split(" ")[0]);
            int j = Integer.parseInt(basket.split(" ")[1]);
            int k = Integer.parseInt(basket.split(" ")[2]);

            for (int basketNum = i - 1; basketNum < j; basketNum++) {
                intArr[basketNum] = k;
            }
        }

        for (int arrIdx = 0; arrIdx < n; arrIdx++) {
            bw.write(intArr[arrIdx] + " ");
        }

        bw.flush(); // Buffer Flush
    }
}