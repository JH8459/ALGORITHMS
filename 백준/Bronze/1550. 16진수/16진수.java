import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String st = br.readLine();

    bw.write(Integer.parseInt(st, 16) + "\n");
    bw.flush();
    bw.close();
  }
}