import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int T = Integer.parseInt(br.readLine());

    for(int i = 0; i < T; i++){
      String line = br.readLine();
      boolean[] alpha = new boolean[26];

      for(int j = 0; j < line.length(); j++){
        if(!alpha[line.charAt(j) - 'A']) {
          alpha[line.charAt(j) - 'A'] = true;
        }
      }

      int ans = 0;
      int cnt = 0;
      
      for(int j = 0; j < alpha.length; j++){
        if(!alpha[j]){
          ans += j;
          cnt++;
        }
      }
      ans += cnt * 65;
      bw.write(ans + "\n");
    }

    bw.flush();
    bw.close();
  }
}