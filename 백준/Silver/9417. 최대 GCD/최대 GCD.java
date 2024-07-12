import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int[] nArr = new int[st.countTokens()];
      int maxGCD = Integer.MIN_VALUE;

      for(int j = 0; j < nArr.length; j++){
        nArr[j] = Integer.parseInt(st.nextToken());
      }

      for(int j = 0; j < nArr.length - 1; j++){
        for(int k = j + 1; k < nArr.length; k++){
          maxGCD = Math.max(maxGCD, getGCD(nArr[j], nArr[k]));
        }
      }

      bw.write(maxGCD + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static int getGCD(int a, int b) {
    if(b == 0){
      return a;
    } else {
      return getGCD(b, a % b);
    }
  }

}