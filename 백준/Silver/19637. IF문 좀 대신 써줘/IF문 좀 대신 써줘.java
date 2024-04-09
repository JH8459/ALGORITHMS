import java.io.*;
import java.util.*;

public class Main {
  public static class Character {
    String title;
    long value;

    private Character (String title, long value){
      this.title = title;
      this.value = value;
    }
  }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    Character[] nArr = new Character[n];

    for(int i = 0; i < n; i ++){
      st = new StringTokenizer(br.readLine());

      String title = st.nextToken();
      long value = Long.parseLong(st.nextToken());

      nArr[i] = new Character(title, value);
    }

    for(int i = 0; i < m; i++){
      long num = Long.parseLong(br.readLine());

      int start = 0;
      int last = n - 1;

      while (start <= last){
        int mid = (start + last) / 2;

        if(nArr[mid].value < num){
          start = mid + 1;
        } else {
          last = mid - 1;
        }
      }

      sb.append(nArr[start].title).append("\n");
    }

    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}