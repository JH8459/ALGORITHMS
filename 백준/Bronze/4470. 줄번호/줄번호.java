import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i = 1; i <= n; i++){
      String s = br.readLine();

      bw.write(i + ". " + s + "\n");
    }

    bw.flush();
    bw.close();
  }
}