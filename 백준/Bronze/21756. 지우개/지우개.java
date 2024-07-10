import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    ArrayList<Integer> nArr = new ArrayList<>();

    for(int i = 1; i <= n; i++) {
      nArr.add(i);
    }

    while(nArr.size() > 1) {
      for(int i = 0; i < nArr.size(); i++) {
        nArr.remove(i);
      }
    }

    bw.write(nArr.get(0).toString() + "\n");
    bw.flush();
    bw.close();
  }
}