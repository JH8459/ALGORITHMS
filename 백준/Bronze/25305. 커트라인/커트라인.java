import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int[] nArr = new int[n];
    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nArr);

    bw.write(nArr[n - k] + "\n");
    bw.flush();
    bw.close();
  }
}