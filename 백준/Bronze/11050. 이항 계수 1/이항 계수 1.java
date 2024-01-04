import java.io.*;
import java.util.*;

public class Main {

  public static void main(String args[]) throws IOException {
    /*
    *  이항 계수 n,k를 구하는 공식은 조합 nCk를 구하는 공식과 같다.
    * */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());

    int result = getFactorial(n) / (getFactorial(k) * getFactorial(n - k));

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }

  public static int getFactorial(int n) {
    if(n == 0 ){
      return 1;
    }

    return n * getFactorial(n - 1);
  }
}