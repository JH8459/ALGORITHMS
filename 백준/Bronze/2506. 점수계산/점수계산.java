import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int bonus = 0;
    int sum = 0;

    for(int i = 1; i <= n; i++){
      int score = Integer.parseInt(st.nextToken());

      if(score == 1){
        sum += (score + bonus);
        bonus += 1;
      } else {
        bonus = 0;
      }
    }

    bw.write(sum + "\n");
    bw.flush();
    bw.close();
  }
}