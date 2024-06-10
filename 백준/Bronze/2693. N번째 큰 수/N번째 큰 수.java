import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    for(int i = 0; i < testCase; i++){
      int[] nArr = new int[10];
      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int j = 0; j < 10; j++){
        nArr[j] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(nArr);

      bw.write(nArr[7] + "\n");
    }

    bw.flush();
    bw.close();
  }
}