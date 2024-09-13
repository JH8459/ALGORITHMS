import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());

    boolean[] slotArr = new boolean[n];
    int result = 0;

    while (q-- > 0){
      st = new StringTokenizer(br.readLine());
      int l = Integer.parseInt(st.nextToken());
      int i = Integer.parseInt(st.nextToken());

      for(int slot = l - 1; slot < n; slot += i){
        slotArr[slot] = true;
      }
    }

    for(boolean slot : slotArr){
      if(!slot){
        result++;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}