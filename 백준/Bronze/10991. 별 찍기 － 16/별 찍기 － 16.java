import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i = 1; i <= n; i++) {
      for(int j = n; j > i; j--) {
        bw.write(" ");
      }
      for(int j = 0; j < 2 * i - 1; j++) {
        if(j % 2 == 0) {
          bw.write("*");
        }
        if(j % 2 == 1) {
          bw.write(" ");
        }
      }
      bw.write("\n");
    }

    bw.flush();
    bw.close();
  }
}