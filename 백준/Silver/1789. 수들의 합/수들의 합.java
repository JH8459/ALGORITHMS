import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long s = Long.parseLong(br.readLine());
    int result = 1;

    while (s >= result) {
      s -= result;

      result++;
    }

    bw.write(--result + "\n");
    bw.flush();
    bw.close();
  }
}