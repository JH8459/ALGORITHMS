import java.io.*;
import java.util.*;

public class Main {
  public static class Score {
    int score;
    int attempt;
    int time;

    private Score (int score, int attempt, int time){
      this.score = score;
      this.attempt = attempt;
      this.time = time;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int result = 0;
    int maxScore = Integer.MIN_VALUE;
    int minAttempt = Integer.MAX_VALUE;
    int minTime = Integer.MAX_VALUE;

    Score[] nArr = new Score[n];

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int score = Integer.parseInt(st.nextToken());
      int attempt = Integer.parseInt(st.nextToken());
      int time = Integer.parseInt(st.nextToken());

      nArr[i] = new Score(score, attempt, time);
    }

    for(int i = 0; i < n; i++){
      if(nArr[i].score > maxScore){
        maxScore = nArr[i].score;
        minAttempt = nArr[i].attempt;
        minTime = nArr[i].time;

        result = i + 1;
      } else if(nArr[i].score == maxScore) {
        if(nArr[i].attempt < minAttempt){
          minAttempt = nArr[i].attempt;
          minTime = nArr[i].time;

          result = i + 1;
        } else if(nArr[i].attempt == minAttempt) {
          if(nArr[i].time < minTime) {
            minTime = nArr[i].time;
            
            result = i + 1;
          }
        }
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}