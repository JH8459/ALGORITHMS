import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int[] nArr = new int[n];
    int sum = 0;

    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(br.readLine());  // -4000 ~ 4000

      sum += nArr[i]; // 누적합
    }

    Arrays.sort(nArr);  // nArr 배열 정렬

    boolean flag = false;
    int frequencyMax = 0;
    int frequencyNum = Integer.MAX_VALUE;

    for(int i = 0; i < n; i++){
      int skip = 0; // 동일한 수가 나온만큼 i를 이동시킬 변수
      int cnt = 1;  // 빈도수를 셀 변수

      for(int j = i + 1; j < n; j++){
        if(nArr[i] != nArr[j]){
          break;
        }
        cnt++;
        skip++;
      }

      if(cnt > frequencyMax){ // 최다 빈도수가 나올 경우
        frequencyMax = cnt;
        frequencyNum = nArr[i];
        flag = true;
      } else if(cnt == frequencyMax && flag) {
        frequencyNum = nArr[i];
        flag = false;
      }

      i += skip;
    }

    bw.write((int)Math.round((double) sum / n) + "\n");  // 산술평균
    bw.write(nArr[n / 2] + "\n"); // 중앙값
    bw.write(frequencyNum + "\n");  // 최빈값
    bw.write(nArr[n - 1] - nArr[0] + "\n"); // 범위
    bw.flush();
    bw.close();
  }
}