import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] pArr = new int[n + 1];
    int[] mArr = new int[n + 1];

    int min = 0;
    int max = 0;

    while (m-- > 0){
      st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      String b = st.nextToken();
      int c = Integer.parseInt(st.nextToken());

      if(Objects.equals(b, "P")){
        if(c == 1){
          pArr[a] = 1;
        } else {
          pArr[a] = -1;
        }
      } else {
        if(c == 0) {
          mArr[a] = 1;
        } else {
          mArr[a] = -1;
        }
      }
    }

    for(int i = 1; i <= n; i++) {
      if(pArr[i] != -1 && mArr[i] != -1) {
        max++;
        if(pArr[i] == 1 && mArr[i] == 1) {
          min++;
        }
      }
    }

    bw.write(min + " " + max + "\n");
    bw.flush();
    bw.close();
  }
}