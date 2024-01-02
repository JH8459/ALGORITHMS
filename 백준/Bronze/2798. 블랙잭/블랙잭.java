import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 카드의 개수
    int m = Integer.parseInt(st.nextToken()); // 카드의 합
    int[] nArr = new int[n];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(st.nextToken());
    }

    int maxSum = Integer.MIN_VALUE;

    for(int i = 0; i < n; i++){
      for(int j = i + 1; j < n; j++){
        for (int k = j + 1; k <n; k++){
          int sum = nArr[i] + nArr[j] + nArr[k];

          if(sum <= m){
            if (maxSum <= sum){
              maxSum = sum;
            }
          }
        }
      }
    }


    bw.write(maxSum + "\n");
    bw.flush();
    bw.close();
  }
}