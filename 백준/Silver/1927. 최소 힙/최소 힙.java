import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for(int i = 0; i < n; i++){
      int command = Integer.parseInt(br.readLine());

      if(command == 0){
        // 0이 입력되는 경우
        if(!pq.isEmpty()){
          bw.write(pq.poll() + "\n");
        } else {
          bw.write("0\n");
        }
      } else {
        pq.add(command);
      }
    }

    bw.flush();
    bw.close();
  }
}