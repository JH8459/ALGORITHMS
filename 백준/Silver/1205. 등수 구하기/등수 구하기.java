import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int score = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());

    int[] rankList = new int[p];

    if(n > 0){
      st = new StringTokenizer(br.readLine());

      for(int i = 0; i < n; i++){
        rankList[i] = Integer.parseInt(st.nextToken());
      }
    }

    Arrays.sort(rankList);

    if(n == p && rankList[0] >= score){
      bw.write(-1 + "\n");
    } else {
      int cnt = 1;

      for(int i = p - 1; i >= Math.max(0, p-n-1); i--){
        if(rankList[i] > score){
          cnt++;
        } else {
          break;
        }
      }

      bw.write(cnt + "\n");
    }

    bw.flush();
    bw.close();
  }
}