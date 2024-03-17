import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    boolean[] s = new boolean[21];
    int n = Integer.parseInt(br.readLine());

    while (n > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      String method = st.nextToken();
      int num = Objects.equals(method, "all") || Objects.equals(method, "empty") ? 0 : Integer.parseInt(st.nextToken());

      switch (method) {
        case "add":
          s[num] = true;
          break;
        case "remove":
          s[num] = false;
          break;
        case "check":
          bw.write(s[num] ? "1\n" : "0\n");
          break;
        case "toggle":
          s[num] = !s[num];
          break;
        case "all":
          for(int i = 0; i <= 20; i++){
            s[i] = true;
          }
          break;
        case "empty":
          for(int i = 0; i <= 20; i++){
            s[i] = false;
          }
          break;
        default:
          break;
      }


      n--;
    }

    bw.flush();
    bw.close();
  }
}