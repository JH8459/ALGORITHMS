import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    while (n-- > 0) {
      String upperStr = br.readLine();
        
      bw.write(upperStr.toLowerCase() + "\n");
    }

    bw.flush();
    bw.close();
  }
}