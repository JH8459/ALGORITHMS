import java.io.*;
import java.text.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    DecimalFormat decFormat = new DecimalFormat("###,###");
    String s = decFormat.format(n);

    bw.write(s +"\n");
    bw.flush();
    bw.close();
  }
}