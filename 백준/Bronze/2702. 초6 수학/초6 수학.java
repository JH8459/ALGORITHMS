import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      bw.write(getLCM(a, b) + " " + getGCD(a, b) + "\n");
    }

    bw.flush();
    bw.close();
  }

  private static int getGCD(int a, int b){
    if(b == 0) {
      return a;
    }

    return getGCD(b, a % b);
  }

  private static int getLCM(int a, int b) {
    return a * b / getGCD(a, b);
  }
}