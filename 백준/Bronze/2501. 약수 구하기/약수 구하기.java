import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int n = Integer.parseInt(s.split(" ")[0]);
        int k = Integer.parseInt(s.split(" ")[1]);

        boolean isExistKDivisor = false;
        int divisor = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisor++;

                if (divisor == k) {
                    isExistKDivisor = true;

                    bw.write(i + "\n");

                    break;
                }
            }
        }

        if (divisor != k) {
            bw.write(0 + "\n");
        }

        bw.flush();
    }
}