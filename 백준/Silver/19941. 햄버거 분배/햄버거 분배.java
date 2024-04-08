import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    char[] nArr = br.readLine().toCharArray();
    boolean[] isVisited = new boolean[n];

    int result = 0;

    for(int i = 0; i < n; i++){
      if(nArr[i] == 'P'){
        for(int j = -k; j <= k; j++){
          if(i + j >= n) break;
          if(i + j < 0) continue;

          if(nArr[i + j] == 'H' && !isVisited[i + j]) {
            isVisited[i + j] = true;
            result += 1;
            break;
          }
        }
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}