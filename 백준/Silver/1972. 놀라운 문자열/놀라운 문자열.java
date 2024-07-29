import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true){
      String s = br.readLine();

      if(Objects.equals(s, "*")){
        break;
      }

      bw.write(getStringIsSurprising(s) ? s + " is surprising.\n" : s + " is NOT surprising.\n");
    }

    bw.flush();
    bw.close();
  }

  public static boolean getStringIsSurprising(String s){
    for (int i = 0; i < s.length() - 1; i++) {
      HashMap<String, Integer> sHashMap = new HashMap<>();

      for (int j = 0; j + i < s.length() - 1; j++) {
        String pair = s.charAt(j) + "" + s.charAt(j + i + 1);

        if (sHashMap.containsKey(pair)) {
          return false;
        }

        sHashMap.put(pair, 1);
      }
    }

    return true;
  }
}