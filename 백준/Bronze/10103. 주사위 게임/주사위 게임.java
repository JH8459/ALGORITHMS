import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());
    int aSum = 100, bSum = 100;

    for(int i = 0; i < num; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int aDice = Integer.parseInt(st.nextToken());
      int bDice = Integer.parseInt(st.nextToken());

      if(aDice > bDice){
        bSum -= aDice;
      } else if(aDice < bDice){
        aSum -= bDice;
      }
    }

    bw.write(aSum + "\n" + bSum + "\n");
    bw.flush();
    bw.close();
  }
}