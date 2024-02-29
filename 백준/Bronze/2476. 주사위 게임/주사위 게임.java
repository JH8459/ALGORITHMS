import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int num = 0;
    int prizeResult = 0;

    for(int i = 0; i < n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());

      if(a == b && b == c){
        int prize = 10000 + a * 1000;

        if(prizeResult < prize){
          prizeResult = prize;
        }
      } else if ( a == b || b == c || a == c){
        if (a == b) {
          num = a;
        } else if (b == c) {
          num = b;
        } else {
          num = c;
        }

        int prize = 1000 + num * 100;

        if(prizeResult < prize){
          prizeResult = prize;
        }
      } else {
        num = Math.max(a, Math.max(b, c));

        int prize = num * 100;

        if(prizeResult < prize){
          prizeResult = prize;
        }
      }
    }

    bw.write(prizeResult + "\n");
    bw.flush();
    bw.close();
  }
}