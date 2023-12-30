import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int k = Integer.parseInt(st.nextToken()); // 보유 중인 랜선의 개수 k
    int n = Integer.parseInt(st.nextToken()); // 만들어야할 랜선의 개수 n
    long[] cableArr = new long[k];

    for (int i = 0; i < k; i++) {
      st = new StringTokenizer(br.readLine());
      cableArr[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(cableArr);

    long start = 0;
    long end = cableArr[k - 1] + 1;  // 길이가 가장 긴 랜선 (middle 값이 0이 나오지 않기 위한 + 1 처리)

    while (start < end) {
      long middle = (start + end) / 2; // 중간 길이
      long cnt = 0; // 중간 길이로 잘랐을 때 나눠지는 몫 (잘린 랜선 갯수)

      for (int i = 0; i < k; i++) {
        cnt += (cableArr[i] / middle);
      }

      if (cnt < n) {
        end = middle;
      } else {
        start = middle + 1;
      }
    }

    bw.write(start - 1 + "\n");
    bw.flush();
    bw.close();
  }
}