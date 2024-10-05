import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    char[] vowel = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

    while (true){
      String s = br.readLine();

      if(Objects.equals(s, "#")){
        break;
      }

      int cnt = 0;

      for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);

        for(int j = 0; j < vowel.length; j++){
          if (ch == vowel[j]) {
            cnt++;
          }
        }
      }

      bw.write(cnt + "\n");
    }

    bw.flush();
    bw.close();
  }
}