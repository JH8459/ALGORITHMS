import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int k = Integer.parseInt(br.readLine());

    for(int i = 0; i < k; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int[] scoreArr = new int[n];

      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int largestGap = 0;

      for(int j = 0; j < n; j++){
        scoreArr[j] = Integer.parseInt(st.nextToken());

        max = Math.max(scoreArr[j], max);
        min = Math.min(scoreArr[j], min);
      }

      Arrays.sort(scoreArr);

      for(int j = 0; j < n - 1; j++){
        int scoreA = scoreArr[j];
        int scoreB = scoreArr[j + 1];

        largestGap = Math.max(largestGap, scoreB - scoreA);
      }

      bw.write("Class " + (i + 1) + "\n");
      bw.write("Max " + max + ", " + "Min " + min + ", " + "Largest gap " + largestGap + "\n");
    }

    bw.flush();
    bw.close();
  }
}