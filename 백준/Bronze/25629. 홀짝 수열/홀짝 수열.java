import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int evenNumCnt = 0, oddNumCnt = 0, result = 0;

    while (n-- > 0){
      int a = Integer.parseInt(st.nextToken());

      if(a % 2 == 0){
        evenNumCnt++;
      } else {
        oddNumCnt++;
      }
    }

    if((evenNumCnt == oddNumCnt) || (oddNumCnt - evenNumCnt == 1)){
      result = 1;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}