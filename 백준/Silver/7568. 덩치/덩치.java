import java.io.*;
import java.util.*;

public class Main {
  public static class Body{
    int weight;
    int height;

    public Body (int weight, int height) {
      this.weight = weight;
      this.height = height;
    }
  };

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    Body[] bigArr = new Body[n];  // 신체 정보를 담을 배열 선언

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int weight = Integer.parseInt(st.nextToken());
      int height = Integer.parseInt(st.nextToken());

      bigArr[i] = new Body(weight, height);
    }

    for(int i = 0; i < n; i++){
      int rank = 1;  // 시작 순위

      for(int j = 0; j < n; j++){
        if(i == j) { // 자기 자신 외 타인 비교
          continue;
        }
        // 덩치가 작은 비교 대상이 있다면 랭크 상승
        if(bigArr[i].weight < bigArr[j].weight && bigArr[i].height < bigArr[j].height){
          rank++;
        }
      }

      bw.write(rank + " ");
    }

    bw.write("\n");
    bw.flush();
    bw.close();
  }
}