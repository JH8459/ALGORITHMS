import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    /*
     * 그리디 알고리즘
     * Do to! 코딩 테스트 203.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    PriorityQueue<Integer> minusPq = new PriorityQueue<>();  // 음의 정수를 저장할 우선순위 큐
    PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());  // 양의 정수를 저장할 우선순위 큐
    int zeroCnt = 0;  // 0의 개수를 저장할 변수
    int oneCnt = 0; // 1의 개수를 저장할 변수

    int n = Integer.parseInt(st.nextToken()); // 수열의 수

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());

      int num = Integer.parseInt(st.nextToken());

      if(num < 0){
        minusPq.add(num);
      } else if(num == 1){
        oneCnt++;
      } else if(num == 0) {
        zeroCnt++;
      } else {
        plusPq.add(num);
      }
    }

    int result = 0;

    // 음의 정수 처리
    while (minusPq.size() > 1) {
      int firstMinus = minusPq.remove();
      int secondMinus = minusPq.remove();

      result += firstMinus * secondMinus;
    }
    // 음의 정수가 존재하며, 0의 개수가 없는 경우 처리
    if(!minusPq.isEmpty() && zeroCnt == 0){
      result += minusPq.remove();
    }
    // 양의 정수 처리
    while (plusPq.size() > 1) {
      int firstPlus = plusPq.remove();
      int secondPlus = plusPq.remove();

      result += firstPlus * secondPlus;
    }
    // 양의 정수가 남은 경우 처리
    if(!plusPq.isEmpty()){
      result += plusPq.remove();
    }
    // 1 처리
    result += oneCnt;

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}