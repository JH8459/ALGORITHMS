import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    int cnt1 = 0, cnt2 = 0;

    for(int i = 0; i <s.length() - 2; i++){
      boolean match = s.charAt(i + 1) == 'O' && s.charAt(i + 2) == 'I';

      if(s.charAt(i) == 'J'){
        if(match){
          cnt1++;
        }
      }
      if(s.charAt(i) == 'I'){
        if(match) {
          cnt2++;
        }
      }
    }

    bw.write(cnt1 + "\n" + cnt2 + "\n");
    bw.flush();
    bw.close();
  }
}