import java.io.*;
import java.util.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] nArr = new int[n];
    int edge = (int) Math.round(n * 0.15);  // 절삭값

    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(nArr);

    long sum = 0;

    for(int i = edge; i < n - edge; i++){
      sum += nArr[i]; // 절삭값 제외 합
    }

    int result = Math.round((float) sum / (n - (edge * 2)));

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}