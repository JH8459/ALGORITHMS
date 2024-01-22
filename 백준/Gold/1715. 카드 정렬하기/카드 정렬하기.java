import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    /*
     * 그리디 알고리즘
     * Do to! 코딩 테스트 199.p
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 카드 묶음의 수
    PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();  // 카드 묶음을 저장할 우선순위 큐 (낮은 숫자가 우선)

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());

      priorityQueueLowest.add(Integer.parseInt(st.nextToken()));
    }

    int firstSmallCard = 0;
    int secondSmallCard = 0;
    int cardSum = 0;

    while (priorityQueueLowest.size() != 1) {
      firstSmallCard = priorityQueueLowest.remove();  // 가장 작은 카드 묶음
      secondSmallCard = priorityQueueLowest.remove(); // 두번째로 작은 카드 묶음

      cardSum += (firstSmallCard + secondSmallCard);  // 두 카드 묶음의 합을 누적한다
      priorityQueueLowest.add(firstSmallCard + secondSmallCard);  // 두 카드 묶음의 합을 다시 카드 큐에 넣는다
    }

    bw.write(cardSum + "\n");
    bw.flush();
    bw.close();
  }
}