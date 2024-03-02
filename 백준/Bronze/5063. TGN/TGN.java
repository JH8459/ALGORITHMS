import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int testCase = Integer.parseInt(br.readLine());

    for(int i = 0; i < testCase; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      long r = Long.parseLong(st.nextToken());
      long e = Long.parseLong(st.nextToken());
      long c = Long.parseLong(st.nextToken());

      if (r + c > e){
        // 광고를 하지 않았을 때 수입 + 광고 비용 > 광고를 했을 때의 수익 (불필요)
        bw.write("do not advertise\n");
      } else if (r + c == e){
        // 광고를 하지 않았을 때 수입 + 광고 비용 = 광고를 했을 때의 수익 (수익 차이가 없음)
        bw.write("does not matter\n");
      } else {
        bw.write("advertise\n");
      }
    }

    bw.flush();
    bw.close();
  }
}