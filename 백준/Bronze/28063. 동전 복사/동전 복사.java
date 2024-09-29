import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());

    int result;

    if(n == 1){
      result = 0;
    } else if((x == 1 || x == n) && (y == 1 || y == n)){
      result = 2;
    }else if(x == 1 || x == n || y == 1 || y == n){
      result = 3;
    } else {
      result = 4;
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}