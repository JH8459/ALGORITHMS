import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int boyFriends = Integer.parseInt(st.nextToken());
      int girsFriends = Integer.parseInt(st.nextToken());

      if(boyFriends + girsFriends == 0){
        break;
      }

      bw.write(boyFriends + girsFriends + "\n");
    }

    bw.flush();
    bw.close();
  }
}