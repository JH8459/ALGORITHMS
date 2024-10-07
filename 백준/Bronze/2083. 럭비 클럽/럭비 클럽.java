import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      String name = st.nextToken();
      int age = Integer.parseInt(st.nextToken());
      int weight = Integer.parseInt(st.nextToken());

      if(Objects.equals(name, "#")){
        break;
      }

      if(age > 17 || weight >= 80){
        bw.write(name + " Senior\n" );
      } else {
        bw.write(name + " Junior\n");
      }
    }

    bw.flush();
    bw.close();
  }
}