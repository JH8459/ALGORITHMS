import java.io.*;
import java.util.*;

public class Main {
  public static class TeamInfo {
    int id;
    int[] scoreList;
    int submitCnt;
    int lastSubmit;
    int totalScore;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int caseTotalCnt = Integer.parseInt(br.readLine());  // 테스트 케이스 수

    for(int castCnt = 0; castCnt < caseTotalCnt; castCnt++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int n = Integer.parseInt(st.nextToken()); // 팀의 개수
      int k = Integer.parseInt(st.nextToken()); // 문제의 개수
      int t = Integer.parseInt(st.nextToken()); // 나의 팀 ID
      int m = Integer.parseInt(st.nextToken()); // 엔트리의 개수

      TeamInfo[] nArr = new TeamInfo[n];

      for(int entry = 0; entry < m; entry++){
        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken()); // 팀 ID
        int j = Integer.parseInt(st.nextToken()); // 문제 번호
        int s = Integer.parseInt(st.nextToken()); // 획득한 점수

        if(nArr[i - 1] == null){
          // 첫등장시 초기화
          nArr[i - 1] = new TeamInfo();

          nArr[i - 1].id = i;
          nArr[i - 1].scoreList = new int[k + 1];
        }

        nArr[i - 1].scoreList[j] = Math.max(s, nArr[i - 1].scoreList[j]);
        nArr[i - 1].submitCnt++;
        nArr[i - 1].lastSubmit = entry;
      }

      for (int i = 0; i < n; i++) {
        int sum = 0;

        for (int j = 1; j <= k; j++) {
          sum += nArr[i].scoreList[j];
        }

        nArr[i].totalScore = sum;
      }

      // 정렬 기준
      // 1. 최종 점수가 높은순, 2. 제출 횟수가 적은순, 3. 제출 시간이 더 빠른순
      Arrays.sort(nArr, Comparator.<TeamInfo>comparingInt(e -> e.totalScore).reversed().thenComparingInt(e -> e.submitCnt).thenComparingInt(e -> e.lastSubmit));

      for (int i = 0; i < n; i++) {
        if (nArr[i].id == t){
          bw.write((i + 1) + "\n");
        }
      }
    }

    bw.flush();
    bw.close();
  }
}