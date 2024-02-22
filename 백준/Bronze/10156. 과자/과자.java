import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int price = Integer.parseInt(st.nextToken());
    int snackCnt = Integer.parseInt(st.nextToken());
    int cash = Integer.parseInt(st.nextToken());

    int result = cash - (price * snackCnt);

    if(result >= 0){
      bw.write(0 + "\n");
    } else {
      bw.write(result * -1 + "\n");
    }

    bw.flush();
    bw.close();
  }
}