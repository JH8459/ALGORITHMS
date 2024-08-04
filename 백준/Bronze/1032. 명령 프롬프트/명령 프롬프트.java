import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String pattern = null;

    while (n-- > 0){
      String s = br.readLine();
      
      if(pattern == null){
        pattern = s;
      } else {
        for(int i = 0; i < pattern.length(); i++){
          if(s.charAt(i) != pattern.charAt(i)){
            pattern = pattern.substring(0, i) + "?" + pattern.substring(i + 1);
          }
        }
      }
    }

    bw.write(pattern + "\n");
    bw.flush();
    bw.close();
  }
}