import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    while (testCase-- > 0){
      int n = Integer.parseInt(br.readLine());
      long[] nArr = new long[n];
      long max = Integer.MIN_VALUE;

      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int i = 0; i < n; i ++){
        nArr[i] = Long.parseLong(st.nextToken());
      }

      long bank = 0;

      for(int i = n - 1; i >= 0; i--){
        if(nArr[i] > max) {
          max = nArr[i];
        }else {
          bank += (max - nArr[i]);
        }
      }

      bw.write(bank + "\n");
    }

    bw.flush();
    bw.close();
  }
}