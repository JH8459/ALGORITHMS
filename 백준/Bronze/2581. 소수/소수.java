import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            boolean isTarget = true;

            if (i != 1) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isTarget = false;
                        break;
                    }
                }

                if (isTarget == true) {
                    sum += i;

                    if (min >= i)
                        min = i;
                }
            }
        }

        if (sum > 0) {
            bw.write(sum + "\n" + min + "\n");
        } else {
            bw.write(-1 + "\n");
        }

        bw.flush();
    }
}