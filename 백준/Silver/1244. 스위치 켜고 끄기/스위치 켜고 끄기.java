import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] nArr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    int peopleCnt = Integer.parseInt(br.readLine());

    for(int i = 0; i < peopleCnt; i++){
      st = new StringTokenizer(br.readLine());

      int gender = Integer.parseInt(st.nextToken());
      int switchNum = Integer.parseInt(st.nextToken());

      if(gender == 1){
        for(int j = switchNum - 1; j < n; j += switchNum){

          nArr[j] = nArr[j] == 1 ? 0 : 1;
        }
      } else {
        int repeatCnt = 1;
        nArr[switchNum - 1] = nArr[switchNum - 1] == 1 ? 0 : 1;

        while (true){
          int left = (switchNum - 1) - repeatCnt;
          int right = (switchNum - 1) + repeatCnt;

          if(left < 0 || right >= n){
            break;
          }

          if(nArr[left] != nArr[right]){
            break;
          }

          nArr[left] = nArr[left] == 1 ? 0 : 1;
          nArr[right] = nArr[right] == 1 ? 0 : 1;

          repeatCnt++;
        }
      }
    }

    for(int i = 0; i < n; i++){
      bw.write(nArr[i] + " ");

      if((i + 1) % 20 == 0){
        bw.write("\n");
      }
    }

    bw.flush();
    bw.close();
  }
}