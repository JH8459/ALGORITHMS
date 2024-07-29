import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int result = 0;
    HashSet<Integer> nSet = new HashSet<>();

    while (n-- > 0){
      StringTokenizer st = new StringTokenizer(br.readLine());

      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      if(b == 1){
        if(nSet.contains(a)){
          result += 1;
        } else {
          nSet.add(a);
        }
      } else {
        if(nSet.contains(a)){
          nSet.remove(a);
        } else {
          result += 1;
        }
      }
    }

    bw.write(result + nSet.size() + "\n");
    bw.close();
  }
}