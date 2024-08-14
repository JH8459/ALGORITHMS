import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    boolean[] nArr = new boolean[100];

    StringTokenizer st = new StringTokenizer(br.readLine());
    int result = 0;

    for(int i = 0; i < n; i++){
      int seat = Integer.parseInt(st.nextToken());

      if(!nArr[seat - 1]){
        nArr[seat - 1] = true;
      } else {
        result++;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}