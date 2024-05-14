import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        for (int j = 1; j <= 2 * n; j++) {
          if (j % 2 == 1) {
            bw.write("*");
          } else {
            bw.write(" ");
          }
        }
      } else {
        for (int j = 1; j <= 2 * n; j++) {
          if (j % 2 == 1) {
            bw.write(" ");
          } else {
            bw.write("*");
          }
        }
      }
      bw.write("\n");
    }
    
    bw.flush();
    bw.close();
  }
}