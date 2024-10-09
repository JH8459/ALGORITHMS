import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    double result = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());

    while (n-- > 0){
      int a = Integer.parseInt(st.nextToken());
      result = a + result - result * a / 100;

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }
}