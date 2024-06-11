import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    for(int i = 0; i < testCase; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int p = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      boolean[] mArr = new boolean[m];
      int result = 0;

      for(int j = 0; j < p; j++){
        int n = Integer.parseInt(br.readLine());

        if(mArr[n - 1] == false){
          mArr[n - 1] = true;
        } else {
          result++;
        }
      }

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }
}