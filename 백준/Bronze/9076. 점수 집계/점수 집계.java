import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    for(int i = 0; i < testCase; i++){
      int[] scoreArr = new int[5];
      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int j = 0; j < 5; j++){
        scoreArr[j] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(scoreArr);

      int[] correctedScoreArr = {scoreArr[1], scoreArr[2], scoreArr[3]};
      int scoreSum = correctedScoreArr[0] + correctedScoreArr[1] + correctedScoreArr[2];

      if(correctedScoreArr[2] - 4 >= correctedScoreArr[0]){
        bw.write("KIN\n");
      } else {
        bw.write(scoreSum + "\n");
      }
    }

    bw.flush();
    bw.close();
  }
}