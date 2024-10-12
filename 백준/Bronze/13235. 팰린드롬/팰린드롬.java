import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    boolean result = false;
    
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == s.charAt(s.length() - i - 1)) {
        result = true;;
      } else {
        result = false;
        break;
      }
    }
    
    bw.write(result + "\n");    
    bw.flush();
    bw.close();
  }
}