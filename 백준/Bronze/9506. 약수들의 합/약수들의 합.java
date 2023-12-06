import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            String result = n + " = ";

            if (n == -1)
                break;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    result = result + i + " + ";
                }
            }

            if (sum != n) {
                result = n + " is NOT perfect." + " + ";
            }

            bw.write(result.substring(0, result.length() - 3) + "\n");
        }

        bw.flush();
    }
}