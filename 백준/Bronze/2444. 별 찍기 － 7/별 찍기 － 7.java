import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().split(" ")[0]);

        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i <= n) {
                for (int j = 1; j < n + i; j++) {
                    if (n - j >= i) {
                        bw.write(" ");
                    } else {
                        bw.write("*");
                    }
                }
            } else {
                for (int j = 1; j <= ((2 * n) - 1) - i + n; j++) {
                    if (i - n >= j) {
                        bw.write(" ");
                    } else {
                        bw.write("*");
                    }
                }
            }

            bw.write("\n");
        }

        bw.flush();
    }
}