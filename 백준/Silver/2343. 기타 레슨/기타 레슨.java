import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
     * 이진 탐색 => O(logN)
     * Do to! 코딩 테스트 186.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int maxDiskSize = Integer.MIN_VALUE;
    int sumDiskSize = 0;

    int[] lectureArr = new int[n];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      lectureArr[i] = Integer.parseInt(st.nextToken());
      // 가장 큰 강의 시간을 찾는다
      if (lectureArr[i] >= maxDiskSize) {
        maxDiskSize = lectureArr[i];
      }

      sumDiskSize = sumDiskSize + lectureArr[i]; // 강의 시간의 총합을 찾는다
    }

    int start = maxDiskSize;  // 디스크 사이즈 탐색 시작점은 최대 길이 강의 시간 부터 시작한다
    int end = sumDiskSize;  // 디스크 사이즈 탐색 종료 시점은 강의 시간의 합 부터 시작한다

    while (start <= end) {
      int middle = (start + end) / 2;
      int lectureSum = 0;
      int diskCnt = 0;

      for (int i = 0; i < n; i++) {
        if (lectureSum + lectureArr[i] > middle) {
          // 디스크 교체
          diskCnt++;
          lectureSum = 0;
        }

        lectureSum = lectureSum + lectureArr[i];
      }

      if (lectureSum != 0) {
        diskCnt++;
      }

      if (diskCnt > m) {
        start = middle + 1;
      } else {
        end = middle - 1;
      }
    }

    bw.write(start + "\n");
    bw.flush();
    bw.close();
  }
}