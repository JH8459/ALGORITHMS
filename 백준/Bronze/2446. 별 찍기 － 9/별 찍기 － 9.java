import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        bw.write(" ");
      }

      for (int j = 0; j < (2 * n - 1) - (2 * i); j++) {
        bw.write("*");
      }

      bw.write("\n");
    }

    for (int i = 0; i < n - 1; i++) {
      for (int j = 1; j < (n - 1) - i; j++) {
        bw.write(" ");
      }

      for (int j = 0; j < 3 + 2 * i; j++) {
        bw.write("*");
      }

      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}