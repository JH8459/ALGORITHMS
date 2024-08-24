import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int maxReward = 0;

    while (n-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int[] diceArr = new int[6];
      int sameDiceCnt = 0;
      int sameDiceNum = 0;
      int subSameDiceCnt = 0;
      int subSameDiceNum = 0;
      int reward = 0;

      for(int i = 0; i < 4; i++){
        diceArr[Integer.parseInt(st.nextToken()) - 1] += 1;
      }

      for(int i = 0; i < 6; i++){
        if(diceArr[i] > sameDiceCnt){
          sameDiceCnt = diceArr[i];
          sameDiceNum = i + 1;
        } else if(diceArr[i] == sameDiceCnt){
          if(diceArr[i] == 2){
            subSameDiceCnt = diceArr[i];
            subSameDiceNum = i + 1;
          } else {
            if(i + 1 > sameDiceNum){
              sameDiceNum = i + 1;
            }
          }
        }
      }

      if(sameDiceCnt == 4){
        reward = 50000 + sameDiceNum * 5000;
      } else if(sameDiceCnt == 3){
        reward = 10000 + sameDiceNum * 1000;
      } else if(sameDiceCnt == 2){
        if(subSameDiceCnt == 2){
          reward = 2000 + (sameDiceNum * 500) + (subSameDiceNum * 500);
        } else {
          reward = 1000 + sameDiceNum * 100;
        }
      } else {
        reward = sameDiceNum * 100;
      }

      maxReward = Math.max(maxReward, reward);
    }

    bw.write(maxReward + "\n");
    bw.flush();
    bw.close();
  }
}