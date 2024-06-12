import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for(int i = 0; i < t; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int sum = 0;
      int min = Integer.MAX_VALUE;

      for(int j = 0; j < 7; j++){
        int n = Integer.parseInt(st.nextToken());

        if(n % 2 == 0){
          sum += n;
          min = Math.min(min, n);
        }
      }

      bw.write(sum + " " + min + "\n");
    }

    bw.flush();
    bw.close();
  }
}