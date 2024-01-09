import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int cnt = 0;
    int n = Integer.parseInt(br.readLine());

    while (true) {
      if ( n % 5 == 0){
        bw.write(n /5 + cnt + "\n");
        break;
      } else if (n < 0) {
        bw.write("-1\n");
        break;
      }

      n = n - 3;
      cnt++;
    }

    bw.flush();
    bw.close();
  }
}