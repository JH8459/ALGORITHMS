import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int[][] blockArr = new int[n][m];

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    int result = 0;
    boolean isFlat = true;

    for(int i = 0; i < n; i ++){
      st = new StringTokenizer(br.readLine());

      for(int j = 0; j < m; j++){
        blockArr[i][j] = Integer.parseInt(st.nextToken());

        if(blockArr[i][j] > max){
          max = blockArr[i][j];
        }

        if(blockArr[i][j] < min){
          min = blockArr[i][j];
        }
      }
    }

    int leastTime = Integer.MAX_VALUE; // 최소 시간을 저장 할 변수
    int height = 0; // 높이 결과를 저장 할 변

    for(int i = min; i <= max; i++){
      int time = 0;
      int inventoryBlock = b;

      for(int j = 0; j < n; j++) {
        for(int k = 0; k < m; k++) {
          //현재 좌표의 층이 목표 층수보다 높으면 제거
          if(i < blockArr[j][k]) {
            time += ((blockArr[j][k] - i) * 2);
            inventoryBlock += (blockArr[j][k] - i);
            //낮을 경우 블록은 제거
          }else {
            time += (i - blockArr[j][k]);
            inventoryBlock -= (i - blockArr[j][k]);
          }
        }
      }
      // 현재 인벤토리안의 블럭의 갯수가 음수가 되면 반복문 종료
      if(inventoryBlock < 0){
        break;
      }
      // 최소시간이 발견된 경우 소모 시간과 높이를 저장한다
      if(leastTime >= time){
        leastTime = time;
        height = i;
      }
    }

    bw.write(leastTime + " " + height);
    bw.flush();
    bw.close();
  }
}