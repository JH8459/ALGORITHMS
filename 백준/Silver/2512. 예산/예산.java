import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[] nArr = new int[n];
    int left = 0, right = Integer.MIN_VALUE;

    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int i = 0; i < n; i++){
      nArr[i] = Integer.parseInt(st.nextToken());
      right = Math.max(nArr[i], right);
    }

    int m = Integer.parseInt(br.readLine());

    while (left <= right){
      int mid = (left + right) / 2;
      long budge = 0;

      for(int i = 0; i < n; i++){
        if(nArr[i] > mid){
          budge += mid;
        } else {
          budge += nArr[i];
        }
      }

      if(budge <= m){
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    bw.write(right + "\n");
    bw.flush();
    bw.close();
  }
}