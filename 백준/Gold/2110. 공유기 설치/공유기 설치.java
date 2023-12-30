import java.io.*;
import java.util.*;

public class Main {

  public static int n;
  public static long[] houseArr;

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    n = Integer.parseInt(st.nextToken()); // 집의 개수
    int c = Integer.parseInt(st.nextToken()); // 공유기의 개수
    houseArr = new long[n];

    for (int i = 0; i < n; i++) {
      houseArr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(houseArr);

    long start = 1; // 최소 거리가 가질 수 있는 최소값
    long end = houseArr[n - 1] - houseArr[0] + 1; // 최소 거리가 가질 수 있는 최대값 (가장 먼 두 집 간의 간격)

    while (start < end) {
      long middle = (start + end) / 2;

      if (getWifiCnt(middle) < c) {
        // middle 거리에 대해 설치 가능한 와이파이 공유기의 개수가 c보다 작으면, 거리를 좁힌다.
        end = middle;
      } else {
        // 아니라면, 거리를 벌린다
        start = middle + 1;
      }
    }

    bw.write(start - 1 + "\n");
    bw.flush();
    bw.close();
  }

  public static int getWifiCnt(long distance) {
    // 첫번쨰 집은 무조건 설치한다
    int cnt = 1;
    long lastWifi = houseArr[0];

    for (int i = 1; i < n; i++) {
      long now = houseArr[i];

      if (now - lastWifi >= distance) {
        cnt++;
        lastWifi = now;
      }
    }

    return cnt;
  }
}