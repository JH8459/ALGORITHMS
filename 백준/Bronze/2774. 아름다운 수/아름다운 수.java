import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while (t-- > 0){
      String s = br.readLine();
      HashSet<Integer> hSet = new HashSet<>();

      for(int i = 0; i < s.length(); i++){
        hSet.add((int) s.charAt(i));
      }

      bw.write(hSet.size() + "\n");
    }

    bw.flush();
    bw.close();
  }
}