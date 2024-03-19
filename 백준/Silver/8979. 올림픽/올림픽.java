import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken()) - 1;

    int[][] arr = new int[n][3];
    int rank = 1;

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());

      int index = Integer.parseInt(st.nextToken()) - 1;
      int gold = Integer.parseInt(st.nextToken());
      int silver = Integer.parseInt(st.nextToken());
      int bronze = Integer.parseInt(st.nextToken());

      arr[index][0] = gold;
      arr[index][1] = silver;
      arr[index][2] = bronze;
    }

    for(int i = 0; i < n; i++) {
      if(arr[i][0] > arr[k][0]) {
        rank++;
      }
      else if(arr[i][0] == arr[k][0] && arr[i][1] > arr[k][1]) {
        rank++;
      }
      else if(arr[i][0] == arr[k][0] && arr[i][1] == arr[k][1] && arr[i][2] > arr[k][2]) {
        rank++;
      }
    }

    bw.write(rank + "\n");
    bw.flush();
    bw.close();
  }
}