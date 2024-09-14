import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String s = (n == 1) ? "Leading the Way to the Future" : "YONSEI";

    bw.write(s + "\n");
    bw.flush();
    bw.close();
  }
}