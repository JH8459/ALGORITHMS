import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    while (testCase-- > 0){
      int s = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());

      int sum = s;

      for(int i = 0; i < n; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());

        int q = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        sum += (q * p);
      }

      bw.write(sum + "\n");
    }

    bw.flush();
    bw.close();
  }
}