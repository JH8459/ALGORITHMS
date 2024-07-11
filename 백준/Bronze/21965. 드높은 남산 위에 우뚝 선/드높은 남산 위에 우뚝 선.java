import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] nArr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    bw.write(isMountain(nArr) + "\n");
    bw.flush();
    bw.close();
  }

  public static String isMountain(int[] nArr){
    boolean isMountain = true;
    int count = 0;

    for(int i = 1; i < nArr.length; i++) {
      if(nArr[i - 1] < nArr[i]) {
        if(count == -1) {
          isMountain = false;
          break;
        }

        count++;
      } else if(nArr[i - 1] == nArr[i]) {
        isMountain = false;
        break;
      } else {
        count = -1;
      }
    }

    return isMountain ? "YES" : "NO";
  }
}