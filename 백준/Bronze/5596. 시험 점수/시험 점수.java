import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int result = 0;

    for(int i = 0; i < 2; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int scoreSum = 0;

      for(int j = 0; j < 4; j++){
        scoreSum += Integer.parseInt(st.nextToken());
      }

      result = Math.max(scoreSum, result);
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}