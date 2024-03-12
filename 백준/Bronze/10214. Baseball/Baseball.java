import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    for(int i = 0; i < t; i++){
      int aSum = 0;
      int bSum = 0;

      for(int j = 0; j < 9; j++){
        StringTokenizer st = new StringTokenizer(br.readLine());

        aSum += Integer.parseInt(st.nextToken());
        bSum += Integer.parseInt(st.nextToken());
      }

      if(aSum > bSum){
        bw.write("Yonsei\n");
      } else if(aSum < bSum){
        bw.write("Korea\n");
      } else{
        bw.write("Draw\n");
      }
    }

    bw.flush();
    bw.close();
  }
}