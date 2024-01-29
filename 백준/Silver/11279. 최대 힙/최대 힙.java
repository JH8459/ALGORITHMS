import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // 우선순위 큐 (내림차순)

    for(int i = 0; i < n; i++){
      int num = Integer.parseInt(br.readLine());

      if(num == 0){
        if(pq.isEmpty()){
          bw.write("0\n");  // 큐가 비어있다면 0 출력
        } else {
          bw.write(pq.remove() + "\n"); // 가장 큰 값 출력
        }
      } else {
        pq.add(num);
      }
    }

    bw.flush();
    bw.close();
  }
}