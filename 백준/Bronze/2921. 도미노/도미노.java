import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int sum = 0;

    for (int i = 0; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        sum += i;
        sum += j;
      }
    }

    bw.write(sum + "\n");
    bw.flush();
    bw.close();
  }
}