import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int result = 0;

    for (int a = 1; a < n; a++) {
      for (int b = a; b <= n - a - b; b++) {
        int c = n - a - b;

        if (a + b > c) {
          result++;
        }
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}