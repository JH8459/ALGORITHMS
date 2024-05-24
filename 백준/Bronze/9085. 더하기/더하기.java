import java.io.*;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = Integer.parseInt(br.readLine());

    while (testCase-- > 0){
      int n = Integer.parseInt(br.readLine());
      int sum = 0;

      StringTokenizer st = new StringTokenizer(br.readLine());

      for(int i = 1; i <= n; i++){
        sum += Integer.parseInt(st.nextToken());
      }

      bw.write(sum + "\n");
    }

    bw.flush();
    bw.close();
  }
}