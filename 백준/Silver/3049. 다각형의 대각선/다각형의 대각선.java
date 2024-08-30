import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    bw.write((n * (n - 1) * (n - 2) * (n - 3)) / 24 + "\n");
    bw.flush();
    bw.close();
  }
}