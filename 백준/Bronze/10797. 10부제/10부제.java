import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int day = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    int result = 0;

    for(int i = 0; i < 5; i++){
      int car = Integer.parseInt(st.nextToken());

      if(car % 10 == day){
        result += 1;
      }
    }

    bw.write(result + "\n");
    bw.flush();
    bw.close();
  }
}