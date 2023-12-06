import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i > 1; i--) {
            if (isPrime(i)) {
                bw.write(i + "\n");
                break;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    i = (i / j) + 1;

                    bw.write(j + "\n");
                    break;
                }
            }
        }

        bw.flush();
    }

    // 소수 판별 메서드
    public static boolean isPrime(final int n) {
        boolean isPrime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}