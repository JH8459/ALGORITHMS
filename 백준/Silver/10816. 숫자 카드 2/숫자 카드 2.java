import java.io.*;
import java.util.*;

public class Main {

  public static int n;
  public static long[] nArr;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken());
    nArr = new long[n];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(nArr);

    st = new StringTokenizer(br.readLine());
    long m = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < m; i++) {
      int target = Integer.parseInt(st.nextToken());

      bw.write(getMaxIndex(target) - getMinIndex(target) + " ");
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }

  public static int getMinIndex(int target) {
    int start = 0;
    int end = n;

    while (start < end) {
      int middle = (start + end) / 2;

      if (target <= nArr[middle]) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }

    return start;
  }

  public static int getMaxIndex(int target) {
    int start = 0;
    int end = n;

    while (start < end) {
      int middle = (start + end) / 2;

      if (target < nArr[middle]) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }

    return start;
  }
}