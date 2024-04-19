import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 키워드 개수
    int m = Integer.parseInt(st.nextToken()); // 블로그에 쓴 글의 개수

    Map<String, Boolean> map = new HashMap<>();

    for(int i = 0; i < n; i++){
      map.put(br.readLine(), true);
    }

    int result = n;

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine(), ",");

      while (st.hasMoreTokens()) {
        String s = st.nextToken();

        if (map.containsKey(s)) {
          map.remove(s);
          result--;
        }
      }

      bw.write(result + "\n");
    }

    bw.flush();
    bw.close();
  }
}