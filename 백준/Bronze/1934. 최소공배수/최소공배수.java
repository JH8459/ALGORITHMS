import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i ++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      bw.write((a * b) / gcd(a,b) + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static int gcd(int a, int b) {

    while (b != 0) {
      int r = a % b; // 나머지를 구해준다.

      a = b;
      b = r;
    }

    return a;
  }
}