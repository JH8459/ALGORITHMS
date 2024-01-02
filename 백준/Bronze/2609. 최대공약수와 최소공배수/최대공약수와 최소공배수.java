import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken()); // 첫번째 자연수
    int m = Integer.parseInt(st.nextToken()); // 두번째 자연수

    bw.write(getGreatestCommon(n, m) + " " + getLeastCommon(n, m) + "\n");
    bw.flush();
    bw.close();
  }

  public static int getGreatestCommon(int n, int m) {
    int rest = n % m; // n을 m으로 나눈 나머지를 구한다

    while (rest != 0) {
      n = m;  // 직전 m을 n으로 대입
      m = rest; // 직전 나머지값을 m으로 대입

      rest = n % m; // 나머지가 0이 될때까지 연산을 반복한다
    }

    return m; // 나머지가 0이라면 직전 m(마지막 나머지)이 최대 공약수이다.
  }

  public static int getLeastCommon(int n, int m) {
    return n * m / getGreatestCommon(n, m);
  }
}