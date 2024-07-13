import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCase = 0;

    while (true){
      testCase++;

      String s1 = br.readLine();
      String s2 = br.readLine();

      int[] sArr1 = new int[26];
      int[] sArr2 = new int[26];

      if(Objects.equals(s1, "END") && Objects.equals(s2, "END")){
        break;
      }

      for(int i = 0; i < s1.length(); i++){
        sArr1[s1.charAt(i) - 97] += 1;
      }

      for(int i = 0; i < s2.length(); i++){
        sArr2[s2.charAt(i) - 97] += 1;
      }

      bw.write("Case " + testCase + ": " + (Arrays.equals(sArr1, sArr2) ? "same" : "different") + "\n");
    }

    bw.flush();
    bw.close();
  }
}