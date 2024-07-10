import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true){
      int n = Integer.parseInt(br.readLine());

      if(n == 0){
        break;
      }

      List<String> nList = new ArrayList<>();

      for(int i = 0; i < n; i++){
        nList.add(br.readLine());
      }

      nList.sort(String::compareToIgnoreCase);
      bw.write(nList.get(0) + "\n");
    }

    bw.flush();
    bw.close();
  }
}