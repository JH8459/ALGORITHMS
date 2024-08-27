import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int aScore = 0, bScore = 0;

    while (n-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if(a > b){
        aScore++;
      } else if(b > a){
        bScore++;
      }
    }

    bw.write(aScore + " " + bScore + "\n");
    bw.flush();
    bw.close();
  }
}