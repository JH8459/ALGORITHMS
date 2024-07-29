import java.io.*;
import java.util.*;

public class Main {
  public static int n, m;
  public static int[] nArr, arr;
  public static StringBuilder sb = new StringBuilder();

  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    n = Integer.parseInt(st.nextToken());
    m = Integer.parseInt(st.nextToken());

    nArr = new int[n];
    arr = new int[m];

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nArr);
    dfs(0);

    bw.write(String.valueOf(sb));
    bw.flush();
    bw.close();
  }

  public static void dfs(int depth) {
    if (depth == m) {
      for(int num : arr) {
        sb.append(num + " ");
      }

      sb.append("\n");
    } else {
      int before = 0;

      for(int i = 0; i < n; i++) {
        if(before != nArr[i]) {
          arr[depth] = nArr[i];
          before = nArr[i];

          dfs(depth + 1);
        }
      }
    }
  }
}