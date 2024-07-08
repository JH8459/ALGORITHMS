import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int m = Integer.parseInt(st.nextToken());
    int seed = Integer.parseInt(st.nextToken());
    int x1 = Integer.parseInt(st.nextToken());
    int x2 = Integer.parseInt(st.nextToken());

    boolean isExit = false;

    for(int a = 0; a < m; a++){
      for(int c = 0; c < m; c++){
        if (x1 == (a * seed + c) % m && x2 == (a * x1 + c) % m){
          bw.write(a + " " + c + "\n");
          isExit = true;
          break;
        }
      }

      if(isExit) {
        break;
      }
    }

    bw.flush();
    bw.close();
  }
}