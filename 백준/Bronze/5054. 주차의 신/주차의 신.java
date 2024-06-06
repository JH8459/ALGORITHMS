import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    for(int i = 0 ; i < testCase; i++) {
      int n = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());

      int[] storeArr = new int[n];

      for(int j = 0; j < n; j++){
        storeArr[j] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(storeArr);

      bw.write((storeArr[n - 1] - storeArr[0]) * 2 + "\n");
    }

    bw.flush();
    bw.close();
  }
}