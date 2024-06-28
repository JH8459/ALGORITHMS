import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int tc = Integer.parseInt(br.readLine());

    while (tc-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      bw.write(CountZero(n, m) + "\n");
    }

    bw.flush();
    bw.close();
  }

  public static int CountZero (int n, int m){
    int zeroCnt = 0;

    for(int i = n; i <= m; i++){
      int num = i;
      if(i == 0){
        zeroCnt++;
        continue;
      }

      while (num > 1){
        if(num % 10 == 0){
          zeroCnt++;
        }

        num /= 10;
      }
    }

    return zeroCnt;
  }
}