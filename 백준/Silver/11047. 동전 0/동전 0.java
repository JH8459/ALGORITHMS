import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int coinCnt = Integer.parseInt(st.nextToken());
    int cash = Integer.parseInt(st.nextToken());

    int result = 0;
    int[] coinArr = new int[coinCnt];

    for(int i = 0; i < coinCnt; i++){
      st = new StringTokenizer(br.readLine());

      coinArr[i] = Integer.parseInt(st.nextToken());
    }

    int i = coinCnt;

    while (i > 0){
      if(coinArr[i - 1] > cash){  // 만들어야할 금액보다 동전의 가치가 크다면 PASS
        i--;
      } else {
        result += cash / coinArr[i - 1]; 

        cash = cash % coinArr[i - 1];
        i--;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}