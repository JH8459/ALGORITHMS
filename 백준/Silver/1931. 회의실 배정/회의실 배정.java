import java.io.*;
import java.util.*;

public class Main {
  public static class Conference {
    int start;
    int end;

    public Conference (final int start, final int end) {
      this.start = start;
      this.end = end;
    }
  }

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());

    Conference[] conferenceArr = new Conference[n];

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      conferenceArr[i] = new Conference(start, end);
    }

    Arrays.sort(conferenceArr, ((conferenceA, conferenceB) -> {
      if(conferenceA.end == conferenceB.end){
        return conferenceA.start - conferenceB.start;
      } else {
        return conferenceA.end - conferenceB.end;
      }
    })); // 종료 시간 기준으로 정렬 (종료 시간이 같으면 시작 시간 순으로 정렬)

    int prevEndTime = 0;  // 직전 회의 종료 시간을 담을 변수
    int maxRoom = 0;  // 회의실의 최대 개수를 저장하는 변수

    for(int i = 0; i < n; i++){
      if(prevEndTime <= conferenceArr[i].start){
        prevEndTime = conferenceArr[i].end;
        maxRoom++;
      }
    }

    bw.write(maxRoom + "\n");
    bw.flush();
    bw.close();
  }
}