import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());

    int[] nArr = new int[n];
    int[] sumArr = new int[n + 1];
    int sum = 0;
    int max = Integer.MIN_VALUE;
    int result = 0;

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(st.nextToken());

      sum += nArr[i];
      sumArr[i+1] = sum;
    }

    for (int i = 0; i < x; i++){
      sum += nArr[i];
    }

    for(int i = 0; i <= n-x; i++) {
      int calculated = sumArr[i+x] - sumArr[i];
      max = Math.max(max, calculated);
    }

    for(int i = 0; i <= n-x; i++) {
      int calculated = sumArr[i+x] - sumArr[i];
      if(calculated == max) {
        result += 1;
      }
    }

    if(max == 0){
      bw.write("SAD\n");
    } else {
      bw.write(max + "\n");
      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }
}